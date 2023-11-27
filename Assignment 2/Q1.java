// Q1.	Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Enter the two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("Sum of "+a+" + "+b+ " is = "+sum);
            System.out.print("Enter Y/N to continue: ");
            ch = sc.next().charAt(0);
        } while(ch == 'Y');
        sc.close();
    }
}


