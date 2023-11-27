// Q10. WAP in Java that inputs one number consisting of five digits from the user and separates the number into individual digits and print the digits separated from one another by three spaces. Example: 42325 is the input then output is 4 2 3 2 5.
import java.util.*;
public class Q10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Five digit number: ");
        int n = sc.nextInt();
        // int a = 10;
        int i = 4, s = 0;
        while (n > 0){
            int r = n % 10;
            s += r * Math.pow(10, i);
            n = n / 10;
            i--;
        }
        while (s > 0){
            int r = s % 10;
            System.out.print(r + " ");
            s = s / 10;
        }
        sc.close();
    }
}