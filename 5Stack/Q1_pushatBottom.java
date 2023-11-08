// package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Q1_pushatBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elelment");
        int ele = sc.nextInt();
        st.push(1);
        st.push(12);
        st.push(14);
        st.push(18);
        pushAt(st,ele);

        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
        sc.close();
    }

    static void pushAt(Stack<Integer>st,int ele)
    {
        //base case
        if(st.isEmpty())
        {
            st.push(ele);
            return;
        }

        //kaam
        int temp = st.pop();
        pushAt(st, ele);
        st.push(temp);
    }
}
