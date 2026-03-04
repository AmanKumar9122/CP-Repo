import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'extractErrorLogs' function below.
     *
     * The function is expected to return a LIST of STRING.
     * The function accepts LIST of STRING logs as parameter.
     */

    public static List<String> extractErrorLogs(List<String> logs) {
        // Implement your logic here
        List<String> result = new ArrayList<>();
        for(String log : logs){
            String parts[] = log.split(" ");
            if(parts[3].equals("ERROR") || parts[3].equals("CRITICAL")){
                result.add(log);
            }
        }
        Collections.sort(result, (a,b)->{
            String[] p1 = a.split(" ");
            String[] p2 = b.split(" ");
            String ts1 = dateTime(p1[1], p1[2]);
            String ts2 = dateTime(p2[1], p2[2]);
            return ts1.compareTo(ts2);
        });

        return result;
    }
    public static String dateTime(String date,String time){
        String d[] = date.split("-");
        String year = d[2];
        String month  = d[1];
        String day = d[0];
        String t = time.replace(":", " ");
        return year + month + day + t;
    }
}

public class Solution1 {

    public static void main(String[] args) {

        String inputFile = "logs.txt";
        String outputFile = "error_logs.txt";

        List<String> logs = new ArrayList<>();

        // Read input file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (!line.trim().isEmpty()) {
                    logs.add(line.trim());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
            return;
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }

        // Process logs
        List<String> result = Result.extractErrorLogs(logs);

        // Write output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            for (String record : result) {
                bw.write(record);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}