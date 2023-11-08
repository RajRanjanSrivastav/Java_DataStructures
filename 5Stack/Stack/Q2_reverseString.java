package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Q2_reverseString {
    public static void main(String[] args) {
       Scanner  sc = new Scanner(System.in);
       System.out.println("enter you string");
       String str = sc.nextLine();
       String result = reverse(str);
       System.out.println(result);
       sc.close();
    }

    static String reverse(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            st.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
           sb.append(st.pop());
        }

        str = sb.toString();
        return str;
    }
}
