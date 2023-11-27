// 2) Write a Java program to demonstrate ArithmeticException, NumberFormatException, StringIndexOutOfBoundException, ArrayIndexOutOfBoundException.

public class Q2 {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = 10 / 0;

            // NumberFormatException
            String str = "abc";
            int num = Integer.parseInt(str);

            // StringIndexOutOfBoundsException
            String text = "Hello";
            char ch = text.charAt(10);

            // ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}