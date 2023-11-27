package third;
import first.A;
import second.B;

public class C{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.methodA();
        b.methodA();
        b.methodB();
    }
}