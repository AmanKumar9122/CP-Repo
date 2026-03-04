import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'generateSalesReport' function below.
     *
     * The function is expected to return a LIST of STRING.
     * The function accepts LIST of STRING salesData as parameter.
     */

    public static List<String> generateSalesReport(List<String> salesData) {
    HashMap<String, Integer> hm = new HashMap<>();
    for (String sale : salesData) {
        String[] parts = sale.split(" ");
        String product = parts[1];
        int quantity = Integer.parseInt(parts[2]);
        int cost = Integer.parseInt(parts[3]);
        int revenue = quantity * cost;
        hm.put(product, hm.getOrDefault(product, 0) + revenue);
    }

    ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());
    Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
    List<String> result = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : list) {
        result.add(entry.getKey() + " " + entry.getValue());
    }
    return result;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> salesData = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salesData.add(bufferedReader.readLine());
        }

        List<String> result = Result.generateSalesReport(salesData);

        for (String line : result) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}