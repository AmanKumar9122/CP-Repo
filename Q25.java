import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String s = br.readLine();
            int n = s.length();
            
            int firstOne = -1;
            int lastOne = -1;

            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='1'){
                    firstOne = i;
                    break;
                }
            }
            for (int i = n-1; i >= 0; i--) {
                if(s.charAt(i)=='1'){
                    lastOne = i;
                    break;
                }
            }
            if(firstOne == -1 || firstOne == lastOne){
                System.out.println(0);
                continue;
            }
            int zeros = 0;
            for(int i=firstOne;i<=lastOne;i++){
                if(s.charAt(i)=='0') zeros++;
            }
            System.out.println(zeros);
        }
    }
}
