import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findInvalidTransactions' function below.
     *
     * The function is expected to return a LIST of STRING.
     * The function accepts LIST of STRING records as parameter.
     */

    public static List<String> findInvalidTransactions(List<String> records) {
        // Write your logic here
        List<String> result = new ArrayList<>();
        for(String record : records){
            String parts[] = record.split("\\s+");
            if (parts.length != 4) {
            result.add(record);
            continue;
        }
            String transactionId = parts[0];
            String userId = parts[1];
            String amountStr = parts[2];
            String status = parts[3];
            int amount = 0;

            try{
                amount = Integer.parseInt(amountStr);
            } catch (Exception e){
                result.add(record);
                continue;
            }

            if (amount < 0 || (!status.equals("SUCCESS") && !status.equals("FAILED"))){
                result.add(record);
            }  
            
        }
        return result;
    }
}

public class Solution {

    public static void main(String[] args) {

        String inputFile = "transactions.txt";
        String outputFile = "invalid.txt";

        List<String> records = new ArrayList<>();

        // Read input file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    records.add(line.trim());
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading input file.");
            e.printStackTrace();
            return;
        }

        // Process records
        List<String> invalidRecords = Result.findInvalidTransactions(records);

        // Write invalid records to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            for (String record : invalidRecords) {
                bw.write(record);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing output file.");
            e.printStackTrace();
        }

        // Print total invalid count
        System.out.println(invalidRecords.size());
    }
}