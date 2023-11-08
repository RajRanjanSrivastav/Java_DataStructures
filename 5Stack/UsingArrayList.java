package Stack;

import java.util.ArrayList;

public class UsingArrayList {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);

        while(!st.isEmpty())
        {
           System.out.println(st.peek());
           st.pop();
        }

        System.out.println(st.pop()); 
    }

    static class Stack 
    {
        static ArrayList<Integer> list = new ArrayList<>();
        
        public boolean isEmpty()
        {
            return list.size()==0;
        }

        //push
        public void push(int a)
        {
            list.add(a);
        }

        //pop
        public int pop()
        {
            if(isEmpty()) return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek()
        {
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
        }
    }
}
