//Q1
import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'extractFailedPayments' function below.
     *
     * The function is expected to return a 2D STRING ARRAY.
     * The function accepts 2D_STRING_ARRAY payments as parameter.
     */

    public static List<List<String>> extractFailedPayments(List<List<String>> payments) {
        // ✅ WRITE YOUR LOGIC HERE
        List<List<String>> filtered = new ArrayList<>();
        for(List<String>payment : payments){
            String status = payment.get(3);
            if(status.equals("FAILED")||status.equals("DECLINED")){
                filtered.add(payment);
            }
        }

        Collections.sort(filtered,(a,b)->{
            String ts1 = buildTimeStamp(a.get(1), a.get(2));
            String ts2 = buildTimeStamp(b.get(1), b.get(2));
            return ts1.compareTo(ts2);
        });
        return filtered;
    }
    public static String buildTimeStamp(String date, String time){
        String d[] = date.split("-");
        String day = d[0];
        String month = d[1];
        String year = d[2];
        return year + month + day + time.replace(":", "");
    }
}

public class FailedPaymentExtractor {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        List<List<String>> payments = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] values = br.readLine().trim().split(" ");

            payments.add(Arrays.asList(values));
        }

        List<List<String>> result = Result.extractFailedPayments(payments);

        // Printing Output
        for (List<String> row : result) {
            bw.write(String.join(" ", row));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
