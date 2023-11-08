package S_QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class Q5_twohalves {
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        
        findAns(q);
        while(!q.isEmpty())
        {
            System.out.print(q.remove()+" ");
        }
    }

    public static void  findAns( Queue<Integer> q)
    {
        int size = q.size()/2;
        Queue<Integer> nq = new LinkedList<>();
        while(size>0)
        {
            nq.add(q.remove());
            size--;
        }
        while(!nq.isEmpty())
        {
            q.add(nq.remove());
            q.add(q.remove());
        }
    }

}
