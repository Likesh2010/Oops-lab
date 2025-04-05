public class Exceptional2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }
    }
}
