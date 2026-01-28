import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q41A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        String reversed = new StringBuilder(s).reverse().toString();
        if (reversed.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
