import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'earliestErrorWindow' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_STRING_ARRAY logs as parameter.
     */

    public static int earliestErrorWindow(List<List<String>> logs) {

        // ✅ WRITE YOUR LOGIC HERE
        int left = 0;
        int errorCount = 0;
        for (int right = 0; right < logs.size(); right++) {
            int rightTime = Integer.parseInt(logs.get(right).get(0));
            String status = logs.get(right).get(2);
            if (status.equals("ERROR")) {
                errorCount++;
            }
            while (rightTime - Integer.parseInt(logs.get(left).get(0)) > 5) {
                if (logs.get(left).get(2).equals("ERROR")) {
                    errorCount--;
                }
                left++;
            }
            if (errorCount >= 3) {
                return Integer.parseInt(logs.get(left).get(0));
            }
        }
        return -1;
    }
}

public class ErrorWindowAnalyzer {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        List<List<String>> logs = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] values = br.readLine().trim().split(" ");

            logs.add(Arrays.asList(values));
        }

        int result = Result.earliestErrorWindow(logs);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
