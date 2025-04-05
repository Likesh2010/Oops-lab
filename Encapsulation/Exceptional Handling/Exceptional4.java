class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
public class Exceptional4 {
    public static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age must be 18 or above.");
        else
            System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
