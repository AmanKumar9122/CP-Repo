import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q20 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] parts = br.readLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int n = Integer.parseInt(parts[2]);
            int count = 0;
            while (a<=n && b<=n) {
                if(a<b){
                    a+=b;
                } else {
                    b+=a;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}