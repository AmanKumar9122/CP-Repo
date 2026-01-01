// https://codeforces.com/contest/514/problem/A
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int countDigit = 0;
        long dup = n;
        while(dup>0){
            dup/=10;
            countDigit++;
        }
        long arr[] = new long[countDigit];
        for(int i=countDigit-1;i>=0;i--){
            long rem = n%10;
            if((rem > 9 - rem) && i > 0){
                rem = 9 - rem;
            }
            arr[i] = rem;
            n /= 10;
        }
        long num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }
}
