import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q37 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int moves = (n + 1) / 2;
        while (moves % m != 0) {
            moves++;
        }
        if (moves > n) {
            System.out.println(-1);
        } else {
            System.out.println(moves);
        }
    }
}
