// 9) Write a Java program to demonstrate working of chained exception.

public class Q9 {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException e) {
                throw new RuntimeException("Chained Exception", e);
            }
        } catch (RuntimeException e) {
            System.out.println("Caught a chained exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }
}