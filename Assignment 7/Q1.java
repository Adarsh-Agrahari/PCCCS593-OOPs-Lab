// 1) Write a Java program to print the exception information using toString() method.

public class Q1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}