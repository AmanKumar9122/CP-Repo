import java.util.*;

public class Q2195A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == 67) {
                    found = true;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}
