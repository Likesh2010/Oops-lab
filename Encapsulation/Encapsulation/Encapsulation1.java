class Student{
  private String name;
  private int age;
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
}
public class Encapsulation1{
  public static void main(String[] args){
    Student stu = new Student();
    stu.setName("Mohan");
    stu.setAge(20);
    System.out.println("Student's Name is " + stu.getName());
    System.out.println("Student's Age is " + stu.getAge());
  }
}
