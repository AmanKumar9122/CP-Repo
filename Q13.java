// import java.util.Scanner;

// public class Q13 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] a = new int[n];
//         int[] b = new int[n];

//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//             b[i] = sc.nextInt();
//         }

//         int pass = 0;
//         int maxPass = 0;
//         for(int i=0;i<n;i++){
//             pass = pass-a[i]+b[i];
//             maxPass = Math.max(maxPass, pass);
//         }
//         System.out.println(maxPass);
//     }
// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            a[i] = Integer.parseInt(parts[0]);
            b[i] = Integer.parseInt(parts[1]);
        }

        int pass = 0;
        int maxPass = 0;

        for (int i = 0; i < n; i++) {
            pass = pass - a[i] + b[i];
            maxPass = Math.max(maxPass, pass);
        }

        System.out.println(maxPass);
    }
}
