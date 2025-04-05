public class Exceptional3{
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
