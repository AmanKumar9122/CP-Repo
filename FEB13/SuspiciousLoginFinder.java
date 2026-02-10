import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findSuspiciousUsers' function below.
     *
     * The function is expected to return a STRING ARRAY.
     * The function accepts 2D_STRING_ARRAY logs as parameter.
     */

    public static List<String> findSuspiciousUsers(List<List<String>> logs) {

        // Step 1: Group logs by user
        Map<String, List<List<String>>> userLogsMap = new HashMap<>();

        for (List<String> log : logs) {
            String user = log.get(0);
            userLogsMap
                    .computeIfAbsent(user, k -> new ArrayList<>())
                    .add(log);
        }

        // Step 2: Identify suspicious users
        List<String> suspiciousUsers = new ArrayList<>();
        for (String user : userLogsMap.keySet()) {
            List<List<String>> userLogs = userLogsMap.get(user);
            userLogs.sort((a, b) ->
                    Integer.compare(
                            convertToMinutes(a.get(1)),
                            convertToMinutes(b.get(1))
                    )
            );

            for (int i = 1; i < userLogs.size(); i++) {
                int prevTime = convertToMinutes(userLogs.get(i - 1).get(1));
                int currTime = convertToMinutes(userLogs.get(i).get(1));
                String prevLocation = userLogs.get(i - 1).get(2);
                String currLocation = userLogs.get(i).get(2);
                if ((currTime - prevTime) <= 30 && !prevLocation.equals(currLocation)) {
                    suspiciousUsers.add(user);
                    break;
                }
            }
        }
        Collections.sort(suspiciousUsers);
        return suspiciousUsers;
    }

    private static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}

public class SuspiciousLoginFinder {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        List<List<String>> logs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().trim().split(" ");
            logs.add(Arrays.asList(values));
        }

        List<String> result = Result.findSuspiciousUsers(logs);

        for (String user : result) {
            bw.write(user);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
