import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q271A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        while (true) {
            year++;
            String yearStr = Integer.toString(year);
            if (hasAllDistinctDigits(yearStr)) {
                System.out.println(year);
                break;
            }
        }
    }

    private static boolean hasAllDistinctDigits(String yearStr) {
        boolean[] seen = new boolean[10];
        for (char c : yearStr.toCharArray()) {
            int digit = c - '0';
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
        }
        return true;
    }
}
