// Q7. WAP in Java that reads an Integers and determines as well as prints whether it is Even or Odd.
import java.util.Scanner;
public class Q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Numbers: ");
        int x = sc.nextInt();
        if (x % 2 == 0) System.out.println(x + " is a even number");
        else System.out.println(x + " is a odd number");
        sc.close();
    }
}
