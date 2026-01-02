import java.io.*;
import java.util.*;

public class Q48 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] B = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(A[i], 1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (B[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        A[i][k] = 0;
                    }
                    for (int k = 0; k < m; k++) {
                        A[k][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = 0;
                for (int k = 0; k < n; k++) val |= A[i][k];
                for (int k = 0; k < m; k++) val |= A[k][j];
                if (val != B[i][j]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(A[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
