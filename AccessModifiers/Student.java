package AccessModifiers;

public class Student {
    static int a = 10;  
    int b = 20;          

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Static variable a: " + a);
        System.out.println("Instance variable b: " + s.b);
    }
}
