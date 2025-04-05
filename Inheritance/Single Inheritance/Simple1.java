class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void showName() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    int rollNo;
    Student(String name, int rollNo) {
        super(name); 
        this.rollNo = rollNo;
    }
    void showRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}
public class Simple1{
    public static void main(String[] args) {
        Student s = new Student("Likesh", 101);
        s.showName();     
        s.showRollNo();   
    }
}
