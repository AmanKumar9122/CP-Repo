import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        for (int f : freq) {
            if (f % k != 0) {
                System.out.println("-1");
                return;
            }
        }
        
        StringBuilder base = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int times = freq[i] / k;
            for (int j = 0; j < times; j++) {
                base.append((char) ('a' + i));
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(base);
        }
        
        System.out.println(result.toString());
    }
}
