import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '4' || c == '7') count++;
        }

        String cnt = String.valueOf(count);
        boolean isLucky = true;

        for (char c : cnt.toCharArray()) {
            if (c != '4' && c != '7') {
                isLucky = false;
                break;
            }
        }

        System.out.println(isLucky ? "YES" : "NO");
    }
}
