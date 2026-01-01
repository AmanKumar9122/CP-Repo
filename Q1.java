// https://codeforces.com/problemset/problem/282/A
import java.io.*;

public class Q1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;

        while(n-- > 0){
            String s = br.readLine();
            if(s.contains("++")) x++;
            else x--;
        }

        System.out.println(x);
    }
}
