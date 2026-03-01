import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2203A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String parts[] = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int d = Integer.parseInt(parts[2]);
            int maxAbove = d/m;
            int maxHeight = maxAbove + 1;
            int towers = (n + maxHeight -1)/ maxHeight;
            System.out.println(towers);
        }
    }
}
