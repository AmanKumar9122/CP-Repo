import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q43 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int bestA = -1;
        int bestB = -1;
        int minLength = Integer.MAX_VALUE;
        for (int b = 0; b * 7 <= n; b++) {
            int remaining = n - 7 * b;
            if (remaining % 4 == 0) {
                int a = remaining / 4;
                int length = a + b;
                if (length < minLength || (length == minLength && a > bestA)) {
                    minLength = length;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        if (bestA == -1) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < bestA; i++) sb.append('4');
            for (int i = 0; i < bestB; i++) sb.append('7');
            System.out.println(sb.toString());
        }
    }
}