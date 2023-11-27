// Q9. WAP in Java that takes input from the user the radius of a circle as an integer and print the circle's diameter, circumference and area using the floating point value 3.14159 for π.
import java.util.*;
public class Q9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        int r = sc.nextInt();
        int diameter = 2 * r;
        double circum = 2 * 3.14159 * r;
        double area = 3.14159 * r * r;
        System.out.println("Diameter of circle: " + diameter);
        System.out.println("Circumference of cirlce: " + circum);
        System.out.println("Area of circle: " + area);
        sc.close();
    }
}
