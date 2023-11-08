package S_QUEUE;



public class Q3_usingLinkedlist {

   static class Node{
        Node next;
        int data;
    
        Node(int val)
        {
           this.data=val;
           this.next=null;
        }
    }
    
    static class Queue{
      
     static Node head=null;
     static Node tail=null;
    
     //isEmpty()
     public boolean isEmpty()
     {
       return head==null && tail==null;
     }
    
     //add
     public  void Add(int data)
     {
        Node newnode = new Node(data);
    
        if(isEmpty())
        {
            head=tail=newnode;
            return;
        }
    
        tail.next=newnode;
        tail=newnode;
        return;
        
     }
    
     //remove
     public int Remove()
     {
        if(isEmpty()) return -1;
    
        int front = head.data;
        if(head==tail)
        {
            head=tail=null;
        } 
        else{
            head = head.next;
        }
        return front;
     }
    
    
    }


    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.Add(9);
        qu.Add(91);
        qu.Add(29);
        qu.Add(94);
        qu.Add(39);

        while(!qu.isEmpty())
        {
            System.out.println(qu.Remove());
        }

    }

}