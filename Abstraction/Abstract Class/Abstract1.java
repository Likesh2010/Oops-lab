abstract class Employee{
  String name;
  Employee(String name){
    this.name = name;
  }
  abstract double calculateSalary();
}
class FullTimeEmployee extends Employee{
  double monthlySalary;
  FullTimeEmployee(String name, double salary){
    super(name);
    this.monthlySalary = salary;
  }
  public double calculateSalary(){
    return monthlySalary;
  }
}
class Abstract1{
  public static void main(String[] args){
    FullTimeEmployee emp = new FullTimeEmployee("Mukesh", 50000);
    System.out.println("Employee Name: " + emp.name);
    System.out.println("Monthly Salary: " + emp.calculateSalary()+"Rs");
  }
}
