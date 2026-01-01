import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q26 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; sum + i <= n; i++) {
            sum += i;
            sb.append(s.charAt(sum - 1));
        }

        System.out.println(sb);
    }
}
