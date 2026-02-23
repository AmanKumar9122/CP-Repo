//Q1
import java.io.*;
import java.util.*;

class Result {

    static class Tx {
        String name;
        int time;
        int amount;
        String city;
        String raw;

        Tx(String s){
            raw = s;
            String[] p = s.split(",");
            name = p[0];
            time = Integer.parseInt(p[1]);
            amount = Integer.parseInt(p[2]);
            city = p[3];
        }
    }

    /*
     * Complete the 'invalidTransactions' function below.
     * The function returns STRING ARRAY.
     * The function accepts STRING ARRAY transactions.
     */

    public static List<String> invalidTransactions(List<String> transactions) {

        int n = transactions.size();

        Tx[] arr = new Tx[n];
        for(int i=0;i<n;i++){
            arr[i] = new Tx(transactions.get(i));
        }

        boolean[] invalid = new boolean[n];

        for(int i=0;i<n;i++){

            if(arr[i].amount > 1000)
                invalid[i] = true;

            for(int j=i+1;j<n;j++){
                if(arr[i].name.equals(arr[j].name)
                        && Math.abs(arr[i].time - arr[j].time) <= 60
                        && !arr[i].city.equals(arr[j].city)){

                    invalid[i] = true;
                    invalid[j] = true;
                }
            }
        }

        List<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(invalid[i]) ans.add(arr[i].raw);
        }

        return ans;
    }
}

public class LC1169 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        List<String> transactions = new ArrayList<>();

        for(int i=0;i<n;i++){
            transactions.add(br.readLine().trim());
        }

        List<String> result = Result.invalidTransactions(transactions);

        for(String s : result){
            bw.write(s);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}