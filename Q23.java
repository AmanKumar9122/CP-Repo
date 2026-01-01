import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q23 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;
        int rem = 0;
        for(int i=1;i<=10000;i++){
            sum = (i*(i+1))/2;
            n -= sum;
            if(n<0){
                count = i-1;
                break;
            }
        }
        System.out.println(count);
    }
}
