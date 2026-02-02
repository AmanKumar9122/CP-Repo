import java.io.IOException;
import java.util.Scanner;

public class Day2Feb {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[m];
        int brr[] = new int[n];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        if(m!=n){
            System.out.println("NO");
            return;
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=brr[i]){
                System.out.println("NO");
                return;
            }else{
                System.out.println("YES");
                break;
            }
        }
    }
}
