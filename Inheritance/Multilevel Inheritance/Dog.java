class Do{
  void eat(){
    System.out.println("Dog is eating");
  }
}
class Puppy extends Do{
  void bark(){
    System.out.println("Dog is barking");
  }
}
class Labrador extends Puppy{
  void display(){
    System.out.println("Labrador is a type of Dog");
  }
}
public class Dog{
  public static void main(String[] args){
    Labrador labrador = new Labrador();
    labrador.eat();  
    labrador.bark();  
    labrador.display(); 
  }
}
