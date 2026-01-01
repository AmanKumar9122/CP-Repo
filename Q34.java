import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q34 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= 2 * n; i++) {
            int dist = Math.abs(i - n);

            // leading spaces
            for (int s = 0; s < dist; s++) {
                System.out.print("  ");
            }

            // increasing numbers
            for (int num = 0; num <= n - dist; num++) {
                System.out.print(num);
                if (num != n - dist) System.out.print(" ");
            }

            // decreasing numbers
            for (int num = n - dist - 1; num >= 0; num--) {
                System.out.print(" " + num);
            }

            System.out.println();
        }
    }
}
