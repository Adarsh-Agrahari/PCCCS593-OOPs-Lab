// Q6. Write a java program to create a method based on the input and output. Look at the 
// examples, there is a pattern.

// Examples
// secret(24) ➞ 8
// secret(42) ➞ 8
// secret(15) ➞ -4
// secret(52) ➞ 15
// Notes
// • num >= 10 and num <= 52
// • Math.pow, * and - can be helpful

import java.util.*;
class secret
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Encryted Code: ");
        int n=sc.nextInt();
        int b=n%10;
        int a=n/10;
        int result=(int)Math.pow(a,b)-a*b;
        System.out.println("Decrypted Code: "+result);
        sc.close();
    }
}