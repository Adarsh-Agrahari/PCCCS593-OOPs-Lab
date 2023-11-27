// Q5.	Create a class named 'Shape' with a method to print "This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

class Shape{
    void printing1(){
        System.out.println("This is shape.");
    }
}

class Rectangle1 extends Shape{
    void printing2(){
        System.out.println("This is Rectangle.");
    }
}

class Circle extends Shape{
    void printing3(){
        System.out.println("This is Circle.");
    }
}

class Square1 extends Rectangle1{
    void printing4(){
        System.out.println("Square is a Rectangle.");
    }
}

public class Q5{
    public static void main(String[] args) {
        Square1 obj = new Square1();
        obj.printing1();
        obj.printing2();
    }
}