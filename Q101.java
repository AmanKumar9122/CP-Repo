import java.util.*;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String recipe = sc.next();

        long nb = sc.nextLong();
        long ns = sc.nextLong();
        long nc = sc.nextLong();

        long pb = sc.nextLong();
        long ps = sc.nextLong();
        long pc = sc.nextLong();

        long r = sc.nextLong();

        long needB = 0, needS = 0, needC = 0;
        for (char ch : recipe.toCharArray()) {
            if (ch == 'B') needB++;
            else if (ch == 'S') needS++;
            else if (ch == 'C') needC++;
        }

        long low = 0, high = (long) 1e13;
        long ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            long reqB = Math.max(0, mid * needB - nb);
            long reqS = Math.max(0, mid * needS - ns);
            long reqC = Math.max(0, mid * needC - nc);

            long cost = reqB * pb + reqS * ps + reqC * pc;

            if (cost <= r) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
