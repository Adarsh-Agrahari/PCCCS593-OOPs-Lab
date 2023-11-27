/* Q6. WAP in Java that asks the user to enter 2 integers. Obtain them from the 
user and print their:
(a) Sum.
(b) Product.
(c) Difference.
(d) Quotient. */
import java.util.*;
public class Q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y) System.out.println(x + " is larger");
        else if (x > y) System.out.println(y + " is larger");
        else System.out.println("These numbers are equal.");
        sc.close();
    }
}
