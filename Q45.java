import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q45 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            boolean ok = true;
            for (int i = 0; i < n/2; i++) {
                char a = s.charAt(i);
                char b = s.charAt(n-1-i);
                if(!canMatch(a,b)){
                    ok = false;
                    break;
                }
            }
            sb.append(ok?"YES\n":"NO\n");
        }
        System.out.println(sb.toString());
    }
    static boolean canMatch(char a,char b){
        for(char ca : possible(a)){
            for(char cb : possible(b)){
                if(ca == cb) return true;
            }
        }
        return false;
    }
    static List<Character> possible(char c){
        List<Character> res = new ArrayList<>();
        if(c>'a') res.add((char)(c-1));
        if(c<'z') res.add((char)(c+1));
        return res;
    }
}
