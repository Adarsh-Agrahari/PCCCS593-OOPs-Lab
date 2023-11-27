// Q4.	Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double Area() {
        return length * breadth;
    }

    public double Perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Create a Rectangle
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        System.out.println("Rectangle ~ ");
        System.out.println("Area: " + rectangle.Area());
        System.out.println("Perimeter: " + rectangle.Perimeter());
        System.out.println();
        // Create a Square
        Square square = new Square(5.0);
        System.out.println("Square ~");
        System.out.println("Area: " + square.Area());
        System.out.println("Perimeter: " + square.Perimeter());
    }
}

// Output ~

// Rectangle ~ 
// Area: 20.0
// Perimeter: 18.0

// Square ~
// Area: 25.0
// Perimeter: 20.0