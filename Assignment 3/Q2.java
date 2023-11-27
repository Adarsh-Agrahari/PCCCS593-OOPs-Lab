// Q2.	In the above example, declare the method of the parent class as private and then repeat the first two operations.

class parentclass{
    private void printing1(){
        System.out.println("This is parent class.");
    }
}

class subclass extends parentclass{
    void printing2(){
        System.out.println("This is child class.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        parentclass pc = new parentclass();
        subclass sc = new subclass();
        // a)
        // pc.printing1();
        // b)
        sc.printing2();
        // c)
        // sc.printing1();
    }
}

// In the second code example where the parent class method is declared as private, attempting to call the private method of the parent class using the child class object will result in a compilation error. Therefore, the code for both a) and c) will produce compilation errors.

// a) Method of parent class by object of parent class
// This will not work because the method is private and not accessible.
// parentObj.printMessage();

// c) Method of parent class by object of child class
// This will not work because the method is private and not accessible.
// ((Parent) childObj).printMessage();