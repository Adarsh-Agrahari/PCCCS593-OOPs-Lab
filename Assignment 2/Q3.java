// Q3.	Write a program to print following :

public class Q3 {  
    public static void main(String[] args) {
        
        // Pattern 1
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 2
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 3
        for(int i=1; i<=5; i++) {
            for(int s=4; s>=i; s--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 4
        for(int i=1; i<=5; i++) {
            for(int s=4; s>=i; s--) {
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 5
        for(int i=1; i<=5; i++) {
            for(int s=4; s>=i; s--) {
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Pattern 6
        for(int i=1; i<=5; i++) {
            for(int s=4; s>=i; s--) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
