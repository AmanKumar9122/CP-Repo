// https://codeforces.com/problemset/problem/723/A
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        int median = arr[1];

        int ans = Math.abs(arr[0] - median) +
                  Math.abs(arr[1] - median) +
                  Math.abs(arr[2] - median);

        System.out.println(ans);
    }
}
