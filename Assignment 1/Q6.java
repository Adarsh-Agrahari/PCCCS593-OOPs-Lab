/* Q6. WAP in Java that asks the user to enter 2 integers. Obtain them from the 
user and print their:
(a) Sum.
(b) Product.
(c) Difference.
(d) Quotient. */

import java.util.Scanner;
public class Q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int add = x + y;
        int diff = x - y;
        int mul = x * y;
        double quo = x / y;
        System.out.println("Sum: " + add);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + mul);
        System.out.println("Quotient: " + quo);
        sc.close();
    }
}