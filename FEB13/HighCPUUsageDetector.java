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
        // ✅ WRITE YOUR LOGIC HERE
        Map<String, List<String>> map = new HashMap<>();
        for (List<String> log : logs) {
            String serverId = log.get(0);
            String date = log.get(1);
            String time = log.get(2);
            int cpu = Integer.parseInt(log.get(3));
            if (cpu <= 85)
                continue;
            if (!map.containsKey(serverId)) {
                map.put(serverId, log);
            } else {
                List<String> existing = map.get(serverId);
                if (isEarlier(date, time, existing.get(1), existing.get(2))) {
                    map.put(serverId, log);
                }
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        result.sort((a, b) -> {
            int cpuB = Integer.parseInt(b.get(3));
            int cpuA = Integer.parseInt(a.get(3));
            return cpuB - cpuA;
        });
        return result;
    }

    private static boolean isEarlier(String date1, String time1, String date2, String time2) {
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");
        if (!d1[2].equals(d2[2])) {
            return Integer.parseInt(d1[2]) < Integer.parseInt(d2[2]);
        }
        if (!d1[1].equals(d1[1])) {
            return Integer.parseInt(d1[1]) < Integer.parseInt(d2[1]);
        }
        if (!d1[0].equals(d1[0])) {
            return Integer.parseInt(d1[1]) < Integer.parseInt(d2[1]);
        }

        String[] t1 = time1.split(":");
        String[] t2 = time2.split(":");
        if (!t1[0].equals(t2[0])) {
            return Integer.parseInt(t1[0]) < Integer.parseInt(t2[0]);
        }
        return Integer.parseInt(t1[1]) < Integer.parseInt(t2[1]);
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
