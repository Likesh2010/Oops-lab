abstract class Vehicle{
  String brand;
  Vehicle(String brand){
    this.brand = brand;
  }
  abstract void startEngine();
  void showBrand(){
    System.out.println("Brand: " + brand);
  }
}
class Car extends Vehicle{
  Car(String brand){
    super(brand);
  }
  void startEngine(){
    System.out.println(brand + " engine started.");
  }
}
class Bike extends Vehicle{
  Bike(String brand){
    super(brand);
  }
  void startEngine(){
    System.out.println(brand + " engine started.");
  }
}
public class Abstract4{
  public static void main(String[] args){
    Vehicle ve1 = new Car("Toyota");
    Vehicle ve2 = new Bike("Duke");
    ve1.showBrand();
    ve1.startEngine();
    ve2.showBrand();
    ve2.startEngine();
  }
}
