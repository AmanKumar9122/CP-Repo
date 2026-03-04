import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findTopWords' function below.
     *
     * The function is expected to return a LIST of STRING.
     * The function accepts LIST of STRING lines as parameter.
     *
     * Rules:
     * 1. Count frequency of each word (case-insensitive)
     * 2. Ignore punctuation
     * 3. Return top 5 most frequent words
     * 4. If frequency tie → lexicographically smaller word first
     */

    public static List<String> findTopWords(List<String> lines) {
        // Write your logic here
        HashMap<String, Integer> freq = new HashMap<>();
        for (String line : lines) {
            line = line.toLowerCase();
            line = line.replaceAll("[^a-z]", " ");
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        Collections.sort(list, (a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });

        List<String> result = new ArrayList<>();
        int limit = Math.min(5, list.size());
        for (int i = 0; i < limit; i++) {
            result.add(list.get(i).getKey());
        }
        return result;
    }
}

public class Solution {

    public static void main(String[] args) {

        String inputFile = "document.txt";
        String outputFile = "top_words.txt";

        List<String> lines = new ArrayList<>();

        // Read input file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    lines.add(line.trim());
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading input file.");
            e.printStackTrace();
            return;
        }

        // Call processing function
        List<String> result = Result.findTopWords(lines);

        // Write output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            for (String word : result) {
                bw.write(word);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing output file.");
            e.printStackTrace();
        }
    }
}