import java.io.*;
import java.util.*;

interface Company {

    void assignSalary(int[] salary);

    void averageSalary();

    void maxSalary();

    void minSalary();
}

class EmployeeDept implements Company {

    int[] salary;

    EmployeeDept(int employees) {
        salary = new int[employees];
    }

    public void assignSalary(int[] arr) {

        int limit = Math.min(arr.length, salary.length);

        for(int i=0;i<limit;i++)
            salary[i] = arr[i];

        System.out.println("Salary for employees processed");
    }

    public void averageSalary() {

        double sum = 0;

        for(int s : salary)
            sum += s;

        double avg = sum / salary.length;

        System.out.printf("Average salary is %.2f\n", avg);
    }

    public void maxSalary() {

        int max = salary[0];

        for(int s : salary)
            if(s > max)
                max = s;

        System.out.println("Maximum salary is " + max);
    }

    public void minSalary() {

        int min = salary[0];

        for(int s : salary)
            if(s < min)
                min = s;

        System.out.println("Minimum salary is " + min);
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        EmployeeDept dept = new EmployeeDept(n);

        dept.assignSalary(arr);
        dept.averageSalary();
        dept.maxSalary();
        dept.minSalary();
    }
}