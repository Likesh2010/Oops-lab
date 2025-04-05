interface Animal{
  void makeSound();
}
class Interface1 implements Animal{
  public void makeSound(){
    System.out.println("Woof!");
  }
  public static void main(String[] args){
    Interface1 dog = new Interface1();
    dog.makeSound();
  }
}
