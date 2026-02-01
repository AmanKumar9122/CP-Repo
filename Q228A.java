import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> colors = new HashSet<>();

        // Read 4 horseshoe colors
        for (int i = 0; i < 4; i++) {
            colors.add(sc.nextInt());
        }

        // Minimum horseshoes to buy
        int result = 4 - colors.size();

        System.out.println(result);
        sc.close();
    }
}
