import java.io.*;
import java.util.*;

class Result {

    public static List<String> checkCommonNumbers(List<List<Integer>> A, List<List<Integer>> B) {
        List<String> result = new ArrayList<>();
        // Write your logic here
        for(int i=0;i<A.size();i++){
            List<Integer> arr1 = A.get(i);
            List<Integer> arr2 = B.get(i);
            Set<Integer> set = new HashSet<>();
            for(int num : arr1)
                set.add(num);
            boolean found = false;
            for(int num : arr2){
                if(set.contains(num)){
                    found = true;
                    break;
                }
            }
            if(found)
                result.add("YES");
            else
                result.add("NO");
        }
        return result;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        List<List<Integer>> A = new ArrayList<>();
        List<List<Integer>> B = new ArrayList<>();

        for(int i=0;i<n;i++){

            String[] parts = br.readLine().split(" ");
            int size = Integer.parseInt(parts[0]);

            List<Integer> arr = new ArrayList<>();

            for(int j=1;j<=size;j++)
                arr.add(Integer.parseInt(parts[j]));

            A.add(arr);
        }

        for(int i=0;i<n;i++){

            String[] parts = br.readLine().split(" ");
            int size = Integer.parseInt(parts[0]);

            List<Integer> arr = new ArrayList<>();

            for(int j=1;j<=size;j++)
                arr.add(Integer.parseInt(parts[j]));

            B.add(arr);
        }

        List<String> result = Result.checkCommonNumbers(A,B);

        for(String s : result)
            System.out.println(s);
    }
}