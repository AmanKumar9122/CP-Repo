import java.util.*;
public class Q427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int availablePolice = 0;
        int untreatedCrimes = 0;
        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();
            if (event == -1) {
                // Crime occurred
                if (availablePolice > 0) {
                    availablePolice--;
                } else {
                    untreatedCrimes++;
                }
            } else {
                availablePolice += event;
            }
        }
        System.out.println(untreatedCrimes);
    }
}
