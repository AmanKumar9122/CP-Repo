import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'aggregateMarks' function below.
     *
     * The function is expected to return a LIST of STRING.
     * The function accepts LIST of STRING records as parameter.
     *
     * Each record is in format:
     * studentId subject marks
     */

    public static List<String> aggregateMarks(List<String> records) {
        // Write your logic here
        HashMap<String,Integer> hm = new HashMap<>();
        for(String s:records){
            String parts[] = s.split(" ");
            String id = parts[0];
            String sub = parts[1];
            int marks = Integer.parseInt(parts[2]);
            hm.put(id,hm.getOrDefault(id,0)+marks);
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            String s = entry.getKey() + " " + entry.getValue();
            result.add(s);
        }

        Collections.sort(result,(a,b)->{
            String s1[] = a.split(" ");
            String s2[] = b.split(" ");
            int marks1 = Integer.parseInt(s1[1]);
            int marks2 = Integer.parseInt(s2[1]);
            return marks2 - marks1;
        });


        return result;
    }
}

public class Solution {

    public static void main(String[] args) {

        String inputFile = "marks.txt";
        String outputFile = "result.txt";

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
        List<String> result = Result.aggregateMarks(records);

        // Write output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            for (String line : result) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing output file.");
            e.printStackTrace();
        }
    }
}