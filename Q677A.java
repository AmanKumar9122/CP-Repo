import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q677A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] parts = br.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int h = Integer.parseInt(parts[1]);

        String[] heights = br.readLine().split(" ");

        int width = 0;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(heights[i]);
            if (x > h) {
                width += 2;
            } else {
                width += 1;
            }
        }

        System.out.println(width);
    }
}
