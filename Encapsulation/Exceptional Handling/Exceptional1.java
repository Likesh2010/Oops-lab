public class Exceptional1{
  public static void main(String[] args) {
    try {
        String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Caught null pointer exception.");
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}
