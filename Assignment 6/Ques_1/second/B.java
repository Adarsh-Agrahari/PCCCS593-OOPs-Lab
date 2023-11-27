package second; // If B.java is in a different package

import first.A;

public class B {
    public void access() {
        A a = new A();
        int result = a.sum(5, 7);
        System.out.println("Sum: " + result);
    }
}
