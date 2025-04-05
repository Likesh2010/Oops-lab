interface Shape{
  double area();
}
class Circle implements Shape{
  double radius;
  Circle(double r){
    radius = r;
  }
  public double area(){
    return Math.PI * radius * radius;
  }
}
class Square implements Shape{
  double side;
  Square(double s){
    side = s;
  }
  public double area(){
    return side * side;
  }
}
class Interface2{
  public static void main(String[] args){
    Shape circle = new Circle(4);
    Shape square = new Square(8);
    System.out.println("Circle area: " + circle.area());
    System.out.println("Square area: " + square.area());
  }
}
