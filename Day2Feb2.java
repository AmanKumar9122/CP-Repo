// return the pairs of indices which give the sum k don't count the same number again to count pairs
// just use brute force approach
// 2 8 5 5 2
// 10
// (2,8)
// (5,5)
// count = 2
// don't count (8,2) as it is same as (2,8)
// use boolean array to check if the number is already used or not
import java.util.Scanner;
import java.util.*;
public class Day2Feb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                    int temp = arr[j];
                    arr[j] = arr[n-1];
                    arr[n-1] = temp;
                    n--;
                    count++;
                    break;
                }
            }
        }
        System.out.println("count = " + count);

        // solve using hashset

    }
}
