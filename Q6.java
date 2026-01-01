import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            int place = 1;

            while(n>0){
                int d = n%10;
                if(d!=0){
                    list.add(d*place);
                }
                place*=10;
                n/=10;
            }
            System.out.println(list.size());
            for(int x:list){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
