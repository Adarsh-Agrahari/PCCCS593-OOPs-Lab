// Q1.	Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
// a)	method of parent class by object of parent class
// b)	method of child class by object of child class
// c)	method of parent class by object of child class

class parentclass1{
    void printing1(){
        System.out.println("This is parent class.");
    }
}

class subclass1 extends parentclass1{
    void printing2(){
        System.out.println("This is child class.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        parentclass1 pc = new parentclass1();
        subclass1 sc = new subclass1();
        // a)
        pc.printing1();
        // b)
        sc.printing2();
        // c)
        sc.printing1();
    }
}
