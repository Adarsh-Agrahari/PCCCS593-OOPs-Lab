// Q2.	Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctly guesses the random number. (You can use number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100)

import java.util.*;
class Q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = (int)(Math.random()*100)+1;
        do{
            System.out.print("Guess the number: ");
            int g=sc.nextInt();
            if(g>n) System.out.println("Too high, try again");
            else if(g<n) System.out.println("Too low, try again");
            else{
                System.out.println("Well done!");
                break;
            }
        }
        while(true);
        sc.close();
    }
}
