class Employee{
  private int id;
  private String nam;
  private double salary;
  public void setDetails(int id, String nam, double salary){
    this.id = id;
    this.nam = nam;
    this.salary = salary;
  }
  public void displayDetails(){
    System.out.println("ID: " + id);
    System.out.println("Name: " + nam);
    System.out.println("Salary: Rs." + salary);
  }
}
public class Encapsulation3{
  public static void main(String[] args){
    Employee emp = new Employee();
    emp.setDetails(101346, "Rahul", 55500);
    emp.displayDetails();
  }
}
