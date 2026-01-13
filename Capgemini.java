public class Capgemini {
    public static void main(String[] args) {
        // int a = 6;
        // int b = 5;

        // // Assignment operator 
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);

        // // Logical operator
        // System.out.println((a>b) && (a==b));
        // System.out.println((a>b) || (a==b));
        // System.out.println(!(a>b));

        // // Relational operator
        // System.out.println(a>b);
        // System.out.println(a<b);
        // System.out.println(a>=b);
        // System.out.println(a<=b);
        // System.out.println(a==b);
        // System.out.println(a!=b);

        // // Bitwise operator
        // System.out.println(a & b);
        // System.out.println(a | b);
        // System.out.println(a ^ b);
        // System.out.println(~a);

        // // Shift operator
        // System.out.println(a << 2);
        // System.out.println(b >> 2);

        // // ternary operator
        // int max = (a > b) ? a : b;
        // System.out.println("Maximum value is: " + max);

        // // Print greatest among three number using ternary operator
        // int c = 7;
        // int maxi = (a>b) ? ( (a>c) ? a : c ) : ( (b>c) ? b : c );
        // System.out.println(maxi); 

        // // a = 124 update = 12;
        // System.out.println(124/10);

        // if else ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        // if else
        int number = 4;
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // nested if else
        int age = 20;
        if (age >= 18) {
            if (age >= 21) {
                System.out.println("You are eligible to vote and drink alcohol.");
            } else {
                System.out.println("You are eligible to vote but not to drink alcohol.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}