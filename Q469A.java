import java.util.*;

public class Q469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] passed = new boolean[n + 1];
        int p = sc.nextInt();
        for(int i = 0; i < p; i++){
            passed[sc.nextInt()] = true;
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            passed[sc.nextInt()] = true;
        }
        for(int i = 1; i <= n; i++){
            if(!passed[i]){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }
}
