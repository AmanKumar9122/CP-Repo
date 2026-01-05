import java.io.*;

public class Q51 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String[] p = br.readLine().split(" ");
            long a = Long.parseLong(p[0]);
            long b = Long.parseLong(p[1]);
            long c = Long.parseLong(p[2]);
            long d = Long.parseLong(p[3]);

            sb.append(b).append(" ").append(c).append(" ").append(c).append("\n");
        }
        System.out.print(sb.toString());
    }
}
