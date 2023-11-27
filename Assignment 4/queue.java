// Q3. Write a java program to perform all the operations of the queue by using the abstract class.

abstract class abstractQueue{
    abstract void enqueue(int x);
    abstract void dequeue();
    abstract int front();
    abstract int rear();
    abstract void display();
}
public class queue extends abstractQueue{
    int size=5;
    int front;
    int rear;
    int arr[];
    queue(){
        arr = new int[size];
        front=0;
        rear=-1;
    }
    void enqueue(int x){
        if(rear==size-1){
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear]=x;
    }
    void dequeue(){
        if(front-1==rear){
            System.out.println("Queue Underflow");
            return;
        }
        front++;
    }
    int front(){
        if(front-1==rear){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }
    int rear(){
        if(front-1==rear){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[rear];
    }
    void display(){
        for(int i=front;i<=rear;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
        System.out.println("Front element: "+q.front());
        System.out.println("Rear element: "+q.rear());
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}