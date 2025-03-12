import java.util.Scanner;
public class SwapNumbers{
  public static void main(String[] args){
    Scanner aa = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = aa.nextInt();
    System.out.print("Enter second number: ");
    int b = aa.nextInt();
    a = a + b;
    b = a - b;
    a = a - b;    
    System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
