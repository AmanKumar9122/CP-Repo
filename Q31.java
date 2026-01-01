import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q31 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPage = Integer.parseInt(br.readLine());
        String parts[] = br.readLine().split(" ");
        int n = parts.length;
        int i = 0;
        while(totalPage>0){
            totalPage -= Integer.parseInt(parts[i%n]);
            i++;
        }
        int ans = i%7;
        if(ans==0) System.out.println("7");
        else System.out.println(ans);
    }
}
