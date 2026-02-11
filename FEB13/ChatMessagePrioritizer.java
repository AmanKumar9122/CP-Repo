//Q5
import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'prioritizeMessages' function below.
     *
     * The function is expected to return a 2D STRING ARRAY.
     * The function accepts 2D_STRING_ARRAY messages as parameter.
     */

    public static List<List<String>> prioritizeMessages(List<List<String>> messages) {
        // ✅ WRITE YOUR LOGIC HERE

        Map<String, Integer> priorityMap = new HashMap<>();
        priorityMap.put("HIGH", 0);
        priorityMap.put("MEDIUM", 1);
        priorityMap.put("LOW", 2);

        messages.sort((a, b) -> {

            int p1 = priorityMap.get(a.get(2));
            int p2 = priorityMap.get(b.get(2));

            if (p1 != p2) {
                return p1 - p2;
            }

            int t1 = Integer.parseInt(a.get(1));
            int t2 = Integer.parseInt(b.get(1));

            return t1 - t2;
        });
        return messages;
    }
}

public class ChatMessagePrioritizer {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        List<List<String>> messages = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] values = br.readLine().trim().split(" ");
            messages.add(Arrays.asList(values));
        }

        List<List<String>> result = Result.prioritizeMessages(messages);

        // Print Output
        for (List<String> row : result) {
            bw.write(String.join(" ", row));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

