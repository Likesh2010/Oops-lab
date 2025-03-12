import java.util.Scanner;
public class LargestNumber{
  public static void main(String[] args){
    Scanner la = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = la.nextInt();
    System.out.print("Enter second number: ");
    int num2 = la.nextInt();
    System.out.print("Enter third number: ");
    int num3 = la.nextInt();      
    int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);    
    System.out.println("Largest number is: " + largest);  
  }
}
