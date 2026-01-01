// import java.util.ArrayList;
// import java.util.Scanner;

// class Q11 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         ArrayList<Integer> al = new ArrayList<>();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             al.add(sc.nextInt());
//         }

//         for (int i = 0; i < n; i++) {
//             int p = al.get(i);      
//             arr[p - 1] = i + 1;      
//         }

//         for (int j = 0; j < n; j++) {
//             System.out.print(arr[j] + " ");
//         }
//     }
// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().split(" ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(parts[i]);
            arr[p-1] = i+1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}