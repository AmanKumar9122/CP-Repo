import java.util.*;

public class QQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        long need = n - 1;
        long maxSum = k * (k - 1) / 2;

        if (maxSum < need) {
            System.out.println(-1);
            return;
        }

        long left = 0, right = k - 1;
        long ans = k;

        while (left <= right) {
            long mid = (left + right) / 2;

            // sum of largest mid gains:
            // (k-1) + (k-2) + ... + (k-mid)
            long sum = mid * (2 * k - mid - 1) / 2;

            if (sum >= need) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
