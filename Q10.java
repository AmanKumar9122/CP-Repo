// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class Q10 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         boolean hard = false;
//         while (st.hasMoreTokens()) {
//             if (Integer.parseInt(st.nextToken()) == 1) {
//                 hard = true;
//                 break;
//             }
//         }
//         System.out.println(hard ? "HARD" : "EASY");
//     }
// }

import java.io.*;
import java.util.*;

public class Q10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean hard = false;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x == 1) {
                hard = true;
            }
        }

        System.out.println(hard ? "HARD" : "EASY");
    }
}

