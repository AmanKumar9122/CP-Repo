public class SquareRoot {
    public static void main(String[] args) {
        int n = 16;
        double low = 0;
        double high = n;
        double mid;
        double decimal = 0.00001;
        while (high - low > decimal) {
            mid = (low + high) / 2;
            if (mid * mid > n) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println("Square root of " + n + " is " + low);
    }
}
