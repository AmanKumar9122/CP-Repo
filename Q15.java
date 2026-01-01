import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] parts = br.readLine().split(" ");
        int k = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);
        int w = Integer.parseInt(parts[2]);
        
        int cost = 0;
        for (int i = 1; i <= w; i++) {
            cost = cost + (i*k);
        }
        int borrow = 0;
        if(n<cost){
            borrow = cost - n;
        }
        System.out.println(borrow);
    }
}
