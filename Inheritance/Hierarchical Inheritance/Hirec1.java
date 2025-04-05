class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    void area() {
        System.out.println("Area of circle = π * r * r");
    }
}
class Square extends Shape {
    void area() {
        System.out.println("Area of square = side * side");
    }
}
public class Hirec1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display(); 
        circle.area();    
    }
}	