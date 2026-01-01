import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q22 {
    public static boolean hasCommonCharacter(String s1, String s2) {
        return s1.charAt(0) == s2.charAt(0) || s1.charAt(1) == s2.charAt(1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tableCard = br.readLine();
        String[] handCards = br.readLine().split(" ");

        for (String card : handCards) {
            if (hasCommonCharacter(tableCard, card)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
