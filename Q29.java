import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q29 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] a = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a);
            int diff = a[n]-a[n-1];
            System.out.println(diff);
        }

    }
}
