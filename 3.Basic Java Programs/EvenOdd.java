import java.util.Scanner;
public class EvenOdd{
  public static void main(String[] args){
    Scanner sum = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sum.nextInt();
    if(num % 2 == 0){
        System.out.println(num + " is Even.");
    }else{
        System.out.println(num + " is Odd.");
    }
  }
}
