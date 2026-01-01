import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int l = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int count = 0;
        while(l<=b){
            l*=3;
            b*=2;
            count++;
        }
        System.out.println(count);
    }
}
