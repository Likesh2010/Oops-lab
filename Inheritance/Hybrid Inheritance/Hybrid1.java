interface Engine {
    void start();
}
interface Brake {
    void applyBrake();
}
class Vehicle {
    void fuel() {
        System.out.println("Vehicle uses fuel.");
    }
}
class Car extends Vehicle implements Engine, Brake {
    public void start() {
        System.out.println("Car engine started.");
    }
    public void applyBrake() {
        System.out.println("Car brake applied.");
    }
    void drive() {
        System.out.println("Car is driving...");
    }
}
public class Hybrid1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.fuel();        
        car.start();       
        car.applyBrake();  
        car.drive();       
    }
}
