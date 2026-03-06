import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findBlockedUsers' function below.
     *
     * The function reads logs from inputFile and writes blocked users
     * to outputFile.
     *
     * A user is blocked if they make more than 100 requests
     * within a 60-second window.
     */

    public static void findBlockedUsers(String inputFile, String outputFile) {

        Map<String, Queue<Integer>> userRequests = new HashMap<>();
        Set<String> blockedUsers = new HashSet<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(" ");
                String userId = parts[0];
                int timestamp = Integer.parseInt(parts[1]);

                userRequests.putIfAbsent(userId, new LinkedList<>());
                Queue<Integer> queue = userRequests.get(userId);

                // remove requests older than 60 seconds
                while (!queue.isEmpty() && timestamp - queue.peek() > 60) {
                    queue.poll();
                }

                // add current request
                queue.offer(timestamp);

                // check rate limit
                if (queue.size() > 100) {
                    blockedUsers.add(userId);
                }
            }

            // write blocked users to file
            for (String user : blockedUsers) {
                bw.write(user);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Solution {

    public static void main(String[] args) {

        String inputFile = "api_logs.txt";
        String outputFile = "blocked.txt";

        Result.findBlockedUsers(inputFile, outputFile);

        System.out.println("Blocked users written to " + outputFile);
    }
}