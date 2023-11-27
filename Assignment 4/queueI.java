// Q4. Write a java program to perform all the operations of the queue by using the interface.

interface queueInterface{
    abstract void enqueue(int x);
    abstract void dequeue();
    abstract int front();
    abstract int rear();
    abstract void display();
}
public class queueI implements queueInterface{
    int size=5;
    int front;
    int rear;
    int arr[];
    queueI(){
        arr = new int[size];
        front=0;
        rear=-1;
    }
    public void enqueue(int x){
        if(rear==size-1){
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear]=x;
    }
    public void dequeue(){
        if(front-1==rear){
            System.out.println("Queue Underflow");
            return;
        }
        front++;
    }
    public int front(){
        if(front-1==rear){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }
    public int rear(){
        if(front-1==rear){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[rear];
    }
    public void display(){
        for(int i=front;i<=rear;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        queueI q = new queueI();
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
