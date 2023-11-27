// Q2. WAP in Java to print your name in some other method (in some other Class other than the one in which main() resides and call it from main() method by creating an Object).
public class Q2{
    public static void main(String args[]){
        Name n = new Name();
        n.name();
    }
}
class Name{
    void name(){
        System.out.println("Adarsh Agrahari");
    }
}