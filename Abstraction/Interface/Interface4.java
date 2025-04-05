interface Calculator{
  int add(int a, int b);
  default int subtract(int a, int b){
    return a - b;
  }
  static int multiply(int a, int b){
    return a * b;
  }
}
class SimpleCalculator implements Calculator{
  public int add(int a, int b){
    return a + b;
  }
}
class Interface4{
  public static void main(String[] args){
    SimpleCalculator calc = new SimpleCalculator();
    System.out.println("Addition value is: " + calc.add(13, 6));
    System.out.println("Subtraction value is: " + calc.subtract(15, 4));
    System.out.println("Multiplication value is: " + Calculator.multiply(16, 15)); 
  }
}
