// 10) Write a Java program to demonstrate working of user defined exception.

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class Q10 {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }
}