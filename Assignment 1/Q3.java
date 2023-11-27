// Q3. WAP in Java to print your name in some other method (in some other Class other than the one in which main() resides and call it from main() method without creating an Object).
public class Q3{
    public static void main(String args[]){
        PrintName.printing();
    }
}
class PrintName{
    public static void printing(){
        System.out.println("Adarsh Agrahari");
    }
}