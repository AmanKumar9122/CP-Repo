// https://codeforces.com/problemset/problem/151/A
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int nl = Integer.parseInt(st.nextToken());
        int np = Integer.parseInt(st.nextToken());

        int drink = (k*l)/nl;
        int lime = (c*d);
        int salt = p/np;

        int maxToastPerFriend = Math.min(Math.min(drink, salt),lime)/n;
        System.out.println(maxToastPerFriend);
    }
}
