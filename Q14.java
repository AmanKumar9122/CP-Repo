import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String parts[] = br.readLine().split(" ");
        int num = Integer.parseInt(parts[0]);
        int t = Integer.parseInt(parts[1]);
        while(t-->0){
            if(num % 10 == 0){
                num /= 10;
            } else {
                num -= 1;
            }
        }
        System.out.println(num);
    }
}
