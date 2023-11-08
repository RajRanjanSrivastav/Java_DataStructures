package Stack;

import java.util.Stack;


public class Q3_reverseStack {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // print(st);
        reverse(st);
        print(st);

    }


    static void print(Stack<Integer> st)
    {
      while(!st.isEmpty())
      {
        System.out.print(st.pop()+" ");
      }
      System.out.println();
    }


    static void reverse(Stack<Integer> st)
    {
        //base case
        if(st.isEmpty())
        {
            return ;
        }

        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }

    static void pushAtBottom(Stack<Integer> st,int ele)
    {
        //base case
        if(st.isEmpty())
        {
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, ele);
        st.push(top);
    }
}
