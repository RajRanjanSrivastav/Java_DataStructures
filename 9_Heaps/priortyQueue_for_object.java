import java.util.*;

public class priortyQueue_for_object {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank)
        {
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2)
        {
           return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pQueue = new PriorityQueue<>();

        pQueue.add(new Student("raj",1));
        pQueue.add(new Student("ravi",11));
        pQueue.add(new Student("rahul",19));
        pQueue.add(new Student("rohan",11));

        while(!pQueue.isEmpty())
        {
            System.out.println(pQueue.peek().name +"---->"+ pQueue.peek().rank);
            pQueue.remove();
        }
        
    }
}
