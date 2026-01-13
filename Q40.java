import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q40 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        long cap = Integer.MAX_VALUE;
        long ans = 0;
        for(int i=n-1;i>=0;i--){
            long xi = Math.min(a[i],cap-1);
            if(xi<0) xi = 0;
            ans += xi;
            cap = xi;
        }
        System.out.println(ans);
    }
}
