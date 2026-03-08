// create 2 object of this class and try overriding hashcode method
public class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "Viraj");
        Student1 s2 = new Student1(2, "Aman");
        Student1 s3 = new Student1(3, "Aniket");
        Student1 s4 = new Student1(2, "Aditi");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
    
}
