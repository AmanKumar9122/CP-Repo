import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'removeDuplicateUsers' function below.
     *
     * The function reads data from an input file and writes
     * the cleaned records into an output file.
     *
     * Input File: users.txt
     * Each line format:
     * userId email
     *
     * Output File: cleaned_users.txt
     *
     */

    public static void removeDuplicateUsers(String inputFile, String outputFile) {
        // Write your code here
        HashSet<String> hs = new HashSet<>();
        try(
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        ){
            String line;
            while((line = br.readLine()) != null){
                if(line.trim().isEmpty()) continue;
                String[] parts = line.split("\\s+");
                if(parts.length<2) continue;
                String email = parts[1];
                if(!hs.contains(email)){
                    hs.add(email);
                    bw.write(line);
                    bw.newLine();
                }
            }
         } catch (Exception e) {
                System.out.println("Error processing file: " + e.getMessage());
            
        }

        
    }

}

public class Solution {
    public static void main(String[] args) {

        String inputFile = "users.txt";
        String outputFile = "cleaned_users.txt";

        Result.removeDuplicateUsers(inputFile, outputFile);

    }
}