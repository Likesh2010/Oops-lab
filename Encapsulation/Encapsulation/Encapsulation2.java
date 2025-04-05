class Person{
  private int age;
  public void setAge(int age){
    if(age > 0 && age <= 100){
      this.age = age;
    } 
	else if(age > 100){
      System.out.println("Too Old");
    }
	else{
      System.out.println("Invalid age!");
    }
  }
  public int getAge(){
    return age;
  }
}
public class Encapsulation2{
  public static void main(String[] args){
    Person p = new Person();
    p.setAge(45);
    System.out.println("Age: " + p.getAge());
    p.setAge(-2);
    p.setAge(101);
  }
}
