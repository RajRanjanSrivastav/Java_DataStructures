import java.util.*;
public class priortyQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        pQueue.add(5);
        pQueue.add(3);
        pQueue.add(8);

        System.out.println(pQueue.peek());
        System.err.println(pQueue.poll());
    }

}