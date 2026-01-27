package AccessModifiers;

public class Class {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.b);
        System.out.println(Student.a); 
    }
}
