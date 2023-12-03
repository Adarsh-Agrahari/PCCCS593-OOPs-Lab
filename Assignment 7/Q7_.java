// 7) Write a Java program to demonstrate how exception handling is postponed using throws keyword. 

public class Q7_ {

    static void fun() throws ArithmeticException{
        System.out.println("1");
        int a = 7/0;
        System.out.println("2");
    }
    public static void main(String[] args) {
        try {
            System.out.println("0");
            fun();
            System.out.println("3");
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}