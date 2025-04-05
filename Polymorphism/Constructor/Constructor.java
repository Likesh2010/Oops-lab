class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Constructor{
    public static void main(String[] args) {
        Student stu = new Student("Likesh", 17);
        stu.display();
    }
}
