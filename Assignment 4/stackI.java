// Q2. Write a java program to perform all the operations of the stack by using the interface.

interface stackInterface{
    void push(int x);
    void pop();
    int top();
    void display();
}
public class stackI implements stackInterface{
    int size=5;
    int arr[];
    int top;
    stackI(){
        arr = new int[size];
        top = -1;
    }
    public void push(int x){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=x;
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }
    public int top(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
    public void display(){
        for(int i=0;i<=top;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        stackI s = new stackI();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        System.out.println("Top element: "+s.top());
        s.pop();
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
