class Quadrilateral { 
public void display()
{
  System.out.println("I am a Quadrilateral");
}
} 
class Rectangle extends Quadrilateral {
public void display()
{
  System.out.println("I am a Rectangle");
} 
} 
class Win {
  public static void main(String[] args) 
  {
    Quadrilateral r = new Rectangle();
    r.display();
  }
}