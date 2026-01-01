import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String s = br.readLine();
            int l = s.length();
            int sum = 0;
            int x = s.charAt(0) - '0';
            sum = (x-1) * 10 + (l*(l+1))/2; 
            System.out.println(sum);
        }
    }
}
