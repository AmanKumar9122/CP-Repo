import java.util.Scanner;
public class Q200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfDrinks = sc.nextInt();
        double totalPercentage = 0;

        for (int i = 0; i < numberOfDrinks; i++) {
            totalPercentage += sc.nextInt();
        }

        double result = totalPercentage / numberOfDrinks;

        System.out.println(result);
        sc.close();
    }
}
