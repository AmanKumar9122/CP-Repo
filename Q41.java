import java.io.*;
import java.util.*;

public class Q41 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for (int d = 0; d < n; d++) {
            boolean ok = true;

            // Check x days before
            for (int j = Math.max(0, d - x); j < d; j++) {
                if (a[d] >= a[j]) {
                    ok = false;
                    break;
                }
            }

            // Check y days after
            for (int j = d + 1; ok && j <= Math.min(n - 1, d + y); j++) {
                if (a[d] >= a[j]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                // Output 1-based index
                System.out.println(d + 1);
                return;
            }
        }
    }
}
