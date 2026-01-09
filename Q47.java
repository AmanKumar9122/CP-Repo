import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q47 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] t1 = br.readLine().split(":");
        String[] t2 = br.readLine().split(":");

        int h1 = Integer.parseInt(t1[0]);
        int m1 = Integer.parseInt(t1[1]);
        int h2 = Integer.parseInt(t2[0]);
        int m2 = Integer.parseInt(t2[1]);

        int start = h1 * 60 + m1;
        int end = h2 * 60 + m2;

        int mid = (start + end) / 2;

        int h3 = mid / 60;
        int m3 = mid % 60;

        System.out.printf("%02d:%02d\n", h3, m3);
    }
}
