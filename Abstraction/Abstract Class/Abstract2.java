abstract class Shape{
  abstract double area();
}
class Rectangle extends Shape{
  double len, wid;
  Rectangle(double l, double w){
    len = l;
    wid = w;
  }
  double area(){
    return len * wid;
  }
}
class Triangle extends Shape{
  double bae, hei;
  Triangle(double b, double h){
    bae = b;
    hei = h;
  }
  double area(){
    return (0.5) * bae * hei;
  }
}
class Abstract2{
  public static void main(String[] args){
    Shape rect = new Rectangle(10, 5);
    Shape tri = new Triangle(8, 6);
    System.out.println("Rectangle Area: " + rect.area());
    System.out.println("Triangle Area: " + tri.area());
  }
}
