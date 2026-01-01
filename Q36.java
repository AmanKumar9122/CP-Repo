import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q36 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long result = (n - 1) * n * (n + 1) / 6 + n;
        System.out.println(result);
    }
}
