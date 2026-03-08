// create 2 object of this class and try overriding equals method
public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return id == student.id && name.equals(student.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Viraj");
        Student s2 = new Student(1, "Aman");
        Student s3 = new Student(2, "Aditi");
        Student s4 = new Student(2, "Aditi");
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
    }
}

