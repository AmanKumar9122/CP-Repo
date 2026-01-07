import java.io.*;
import java.util.*;

public class Q55 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int x = Integer.parseInt(parts[1]);

            if (n <= 2) {
                sb.append(1).append('\n');
            } else {
                sb.append(1 + (n - 3) / x + 1).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
