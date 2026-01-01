import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int maxi = Integer.MIN_VALUE;
        int maxInd = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > maxi) {
                maxi = a[i];
                maxInd = i;
            }
        }

        int mini = Integer.MAX_VALUE;
        int minInd = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < mini) {
                mini = a[i];
                minInd = i;
            }
        }

        int res = maxInd + (n-1-minInd);
        if(minInd<maxInd){
            res--;
        }
        System.out.println(res);
    }
}
