import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split("\\+");
        Arrays.sort(parts);
        String s = "";
        for(int i=0;i<parts.length;i++){
            s += parts[i]+"+";
        }
        System.out.println(s.substring(0,s.length()-1));
    }
}
