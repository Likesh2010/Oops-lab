class Male
{
public void eat()
{
System.out.println("Male is eating");
}
}
class Boy extends Male
{
public void eat()
{
System.out.println("Boy is eating");
 }
public static void main( String[] args) {
  Male obj = new Boy();
  obj.eat();
 }
}
