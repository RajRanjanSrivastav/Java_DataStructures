package S_QUEUE;


class Queue
{   
    int arr[];
    int size;
    int reer;

    Queue(int n)
    {
        arr = new int[n];
        size= n;
        reer = -1;
    }
    
    //empty
    public boolean isEmpty()
    {
        return reer==-1;
    }

    //add
    public void Add(int data)
    {
        if(reer==size-1)
        {
            System.out.println("Queue is full");
            return;
        }

        reer = reer+1;
        arr[reer]=data;
    }

    //Remove
    public int Remove()
    {
        if(isEmpty()) return -1;
        int front =0;
        int temp = arr[front];
        
        for(int i=front;i<reer;i++)
        {
            arr[i]=arr[i+1];
        }
        reer = reer-1;
        return temp;
    }

}

public class Q1_imple {
    public static void main(String[] args) {
        Queue qu = new Queue(5);

        //add
        qu.Add(2);
        qu.Add(21);
        qu.Add(28);
        qu.Add(29);
        qu.Add(39);
        // qu.Add(39);    


        //remove
        while(!qu.isEmpty())
        {
            System.out.print(qu.Remove()+"-->");
        }
    }

    
}
