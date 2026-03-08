// printing hashcode of 2 different objects
public class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2(1, "Viraj");
        Student2 s2 = new Student2(2, "Aman");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
