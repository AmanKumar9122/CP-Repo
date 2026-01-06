import java.io.*;
import java.util.*;

public class Q54 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] parts = br.readLine().split(" ");

            int odd = 0, even = 0;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(parts[i]);
                if ((x & 1) == 1) odd++;
                else even++;
            }

            if (odd > 0 && even > 0) {
                out.append("YES\n");
            } else if (odd > 0 && (odd & 1) == 1) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out.toString());
    }
}
