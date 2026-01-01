import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q28 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String s = line.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='y'){
                sb.append('.');
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
