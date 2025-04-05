class Car {
String model;
int year;
Car() {
  model = "Unknown";
  year = 0;
}
Car(String model, int year) {
  this.model = model;
  this.year = year;
}
void display() {
  System.out.println("Model: " + model + ", Year: " + year);
}
public static void main(String[] args) {
  Car car1 = new Car(); 
  Car car2 = new Car("Rolls Royles", 2025); 
  car1.display();
  car2.display();
 }
}