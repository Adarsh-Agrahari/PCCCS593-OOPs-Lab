// 6) Write a Java program to handle the exception using nested try and catch block.

public class Q6 {
    public static void main(String[] args) {
        try {
            try {
                int[] arr = new int[5];
                int value = arr[10]; // This will throw an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }
}