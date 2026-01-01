import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q21 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < n - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }
}
