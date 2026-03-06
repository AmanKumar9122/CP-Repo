import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'longestUniqueSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int longestUniqueSubstring(String s) {
        // Write your logic here
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int result = Result.longestUniqueSubstring(s);

        System.out.println(result);

    }
}