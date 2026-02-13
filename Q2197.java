import java.util.*;

public class Q2197 {

    // Function to calculate digit sum
    public static int digitSum(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            long x = sc.nextLong();
            int count = 0;

            // Only check up to x + 90
            for (long y = x; y <= x + 90; y++) {
                if (y - digitSum(y) == x) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
