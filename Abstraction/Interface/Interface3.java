interface Vehicle{
  void drive();
  void fill();
}
class Tata implements Vehicle{
  public void drive(){
    System.out.println("Driving silently...");
  }
  public void fill(){
    System.out.println("Keep an eye on petrol...");
  }
}
class Interface3{
  public static void main(String[] args){
    Tata car = new Tata();
    car.drive();
    car.fill();
  }
}
