import java.io.*;
import java.util.*;

public class Q49 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[i] = a[i] / 2;
            } else {
                if (a[i] > 0) {
                    b[i] = a[i] / 2;
                } else {
                    b[i] = a[i] / 2;      
                }
            }
            sum += b[i];
        }

        for (int i = 0; i < n && sum != 0; i++) {
            if (a[i] % 2 != 0) {
                if (sum < 0 && a[i] > 0) {
                    b[i]++;
                    sum++;
                } else if (sum > 0 && a[i] < 0) {
                    b[i]--;
                    sum--;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(b[i]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
