// 7) Write a Java program to demonstrate how exception handling is postponed using throws keyword. 

public class Q7 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void doSomething() throws Exception {
        // Code that may throw an exception
        throw new Exception("Exception thrown using throws keyword");
    }
}