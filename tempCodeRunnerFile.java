import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q35 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String parts[] = br.readLine().split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);
            long c = Long.parseLong(parts[2]);
            long x1,x2;

            if(a<c) x1 = 1;
            else x1 = -1;

            if(c<a*b) x2 = b;
            else x2 = -1;

            sb.append(x1).append(" ").append(x2).append("\n");
        }
        System.out.println(sb.toString());
    }
}
