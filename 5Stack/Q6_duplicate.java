package Stack;

import java.util.Stack;

public class Q6_duplicate {
    public static void main(String[] args) {
        String str = "((a+b)*[a+x]*[[a/b]])";
        System.out.println(isDuplicate(str));
    }
    static boolean isDuplicate(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            //closing
            char ch = str.charAt(i);
            if(ch==')' || ch==']' || ch=='}')
            {
                int cnt=0;
                System.out.println("first"+st);
                while(st.peek()!='[' && st.peek() !='{' && st.peek()!='(')
                {

                    cnt++;
                    System.out.println("under the loop " + st);
                    st.pop();
                }
                st.pop(); 
                System.out.println("second"+st);
                if(cnt<1) return true;
            }
            else{
                st.push(ch);
            }
        }
        return false;
    }
}
