import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q33 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        if (a == b) {
            System.out.println(0);
            return;
        }

        if (b % a != 0) {
            System.out.println(-1);
            return;
        }

        int d = b / a;
        int ans = 0;

        while (d % 2 == 0) {
            d /= 2;
            ans++;
        }

        while (d % 3 == 0) {
            d /= 3;
            ans++;
        }

        if (d != 1) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
