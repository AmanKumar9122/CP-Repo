// https://codeforces.com/problemset/problem/263/A
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int indX = 0, indY = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    indX = i;
                    indY = j;
                }
            }
        }
        System.out.println(Math.abs(indX - 2) + Math.abs(indY - 2));

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int[][] mat = new int[5][5];

        // for(int i = 0; i < 5; i++) {
        //     StringTokenizer st = new StringTokenizer(br.readLine());
        //     for(int j = 0; j < 5; j++) {
        //         mat[i][j] = Integer.parseInt(st.nextToken());
        //     }
        // }

        // int indX = 0;
        // int indY = 0;
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<5;j++){
        //         if(mat[i][j]==1){
        //             indX = i;
        //             indY = j;
        //         }
        //     }
        // }

        // int moves = Math.abs(2-indX) + Math.abs(2-indY);
        // System.out.println(moves);

    }
} 