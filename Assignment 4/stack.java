// Q1. Write a java program to perform all the operations of the stack by using an abstract class.

abstract class abstractStack{
    abstract void push(int x);
    abstract void pop();
    abstract int top();
    abstract void display();
}
public class stack extends abstractStack{
    int size=5;
    int arr[];
    int top;
    stack(){
        arr = new int[size];
        top = -1;
    }
    void push(int x){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=x;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }
    int top(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
    void display(){
        for(int i=0;i<=top;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        stack s = new stack();
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
