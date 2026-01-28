import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q734A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int countA = 0;
        int countD = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A') countA++;
            else countD++;
        }
        if(countA>countD) System.out.println("Anton");
        else if(countD>countA) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
