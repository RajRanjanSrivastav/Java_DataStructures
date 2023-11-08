package S_QUEUE;


class CircularQueue{
    int arr[];
    int size;
    int reer;
    int front;

    CircularQueue(int n)
    {
        arr = new int[n];
        size=n;
        reer=-1;
        front=-1;
    }

    //isEmpty
    public boolean isEmpty()
    {
        return reer==-1 && front==-1;
    }

    //isFull
    public boolean isFull()
    {
        return (reer+1)%size == front;
    }

    //Add
    public void Add(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return ;
        }

        if(front==-1)
        {
            front=0;
        }
        
        reer = (reer+1)%size;
        
        arr[reer]=data;
    }


    //Remove
    public int Remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        if(front==reer)
        {
           front = reer = -1;
        }
        else{
          front = (front+1)%size;
        }
        
        return result;
    }
}

public class Q2_circularQueue {
    public static void main(String[] args) {
        CircularQueue qu = new CircularQueue(6);
        qu.Add(2);
        qu.Add(4);
        qu.Add(6);
        qu.Add(8);
        qu.Add(12);
        qu.Add(22);
        // qu.Add(2);   // this can't be add because queue is full

        while(!qu.isEmpty())
        {
            System.out.println(qu.Remove());
        }
        // qu.Remove();


    }
}
