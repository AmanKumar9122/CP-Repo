import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q7 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        for(int i=1;i<=n;i++){
            StringBuilder row = new StringBuilder();
            if(i%2==1){
                for(int j=0;j<m;j++) row.append('#');
            }
            else{
                if(i%4==2){
                    for (int j = 0; j < m - 1; j++) row.append('.');
                    row.append('#');
                } else{
                    row.append('#');
                    for (int j = 0; j < m - 1; j++) row.append('.');
                }
            }
            System.out.println(row);
        }
    }
}
