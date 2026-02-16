import java.util.Scanner;

public class Q155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int maxScore = scores[0];
        int minScore = scores[0];
        int amazingCount = 0;

        for (int i = 1; i < n; i++) {
            if (scores[i] > maxScore) {
                amazingCount++;
                maxScore = scores[i];
            } else if (scores[i] < minScore) {
                amazingCount++;
                minScore = scores[i];
            }
        }

        System.out.println(amazingCount);
    }
}
