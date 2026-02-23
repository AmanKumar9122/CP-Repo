import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String s = br.readLine();
            String parts[] = new String[2];
            parts[0] = s.substring(0, 3);
            parts[1] = s.substring(3, 6);
            int m = Integer.parseInt(parts[0]); 
            int n = Integer.parseInt(parts[1]);
            if(sumOfNum(m) == sumOfNum(n)) System.out.println("YES");
            else System.out.println("NO"); 
        }
    }
    public static int sumOfNum(int x){
        int sum = 0;
        while(x>0){
            int digit = x%10;
            sum += digit;
            x/=10;
        }
        return sum;
    }
}
