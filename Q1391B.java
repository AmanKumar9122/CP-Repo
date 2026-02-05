import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1391B {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            String[] parts = br.readLine().split(" ");
            int a = Integer.parseInt(parts[0]); // rows
            int b = Integer.parseInt(parts[1]); // columns

            char[][] grid = new char[a][b];

            for (int i = 0; i < a; i++) {
                grid[i] = br.readLine().toCharArray();
            }

            int changes = 0;

            // Check last row
            for (int j = 0; j < b - 1; j++) {
                if (grid[a - 1][j] != 'R') {
                    changes++;
                }
            }

            // Check last column
            for (int i = 0; i < a - 1; i++) {
                if (grid[i][b - 1] != 'D') {
                    changes++;
                }
            }

            System.out.println(changes);
        }
    }
}