// 3) Write a Java Program to demonstrate how exception is thrown using throw keyword.

public class Q3 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("This is a custom exception");
        } catch (RuntimeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}