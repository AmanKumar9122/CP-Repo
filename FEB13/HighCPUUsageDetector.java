//Q2
import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'highCpuServers' function below.
     *
     * The function is expected to return a 2D STRING ARRAY.
     * The function accepts 2D_STRING_ARRAY logs as parameter.
     */

    public static List<List<String>> highCpuServers(List<List<String>> logs) {
        Map<String, List<String>> map = new HashMap<>();
        for (List<String> log : logs) {
            int cpu = Integer.parseInt(log.get(3));
            if (cpu <= 85)
                continue;
            String serverId = log.get(0);
            if (!map.containsKey(serverId)) {
                map.put(serverId, log);
            } else {
                List<String> existing = map.get(serverId);
                String ts1 = buildTimestamp(log.get(1), log.get(2));
                String ts2 = buildTimestamp(existing.get(1), existing.get(2));
                if (ts1.compareTo(ts2) < 0) {
                    map.put(serverId, log);
                }
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        result.sort((a, b) -> Integer.parseInt(b.get(3)) - Integer.parseInt(a.get(3)));
        return result;
    }

    private static String buildTimestamp(String date, String time) {
        String[] d = date.split("-");
        return d[2] + d[1] + d[0] + time.replace(":", "");
    }
}

public class HighCPUUsageDetector {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        List<List<String>> logs = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] values = br.readLine().trim().split(" ");

            logs.add(Arrays.asList(values));
        }

        List<List<String>> result = Result.highCpuServers(logs);

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
