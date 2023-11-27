// Q8. WAP in Java that reads two Integers and determines whether the first is a multiple of the second and print the results.
import java.util.Scanner;
public class Q8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        if (first % second == 0) System.out.println(first + " is a multiple of " + second);
        else System.out.println(first + " is not a multiple of " + second);
        sc.close();
    }
}