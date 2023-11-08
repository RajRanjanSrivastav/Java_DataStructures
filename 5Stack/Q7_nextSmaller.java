package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Q7_nextSmaller {
    public static void main(String[] args) {
        int arr[] = {5,4,2,88,1};
        System.out.println(findnextSmaller(arr));
    }

    static String findnextSmaller(int arr[])
    {
        Stack<Integer> st =new Stack<>();
        int ans[] = new int[arr.length];

        for(int i=arr.length-1;i>-1;i--)
        {
           int curn = arr[i];
           while(!st.isEmpty() && curn<st.peek() )
           {
            st.pop();
           }
           if(st.isEmpty())
           {
            ans[i]=-1;
           }
           else{
            ans[i]=st.peek();
           }
           st.push(arr[i]);
        }
        return Arrays.toString(ans);
    }
    
}
