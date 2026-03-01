import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2203B{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String x = br.readLine().trim();

            int n = x.length();
            int[] digits = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                digits[i] = x.charAt(i) - '0';
                sum += digits[i];
            }

            // already beautiful
            if (sum <= 9) {
                System.out.println(0);
                continue;
            }

            // sort digits descending
            Arrays.sort(digits);

            int need = sum - 9; // reduction required
            int moves = 0;

            // pick largest digits first
            for (int i = n - 1; i >= 0 && need > 0; i--) {
                need -= digits[i];
                moves++;
            }

            System.out.println(moves);
        }
    }
}