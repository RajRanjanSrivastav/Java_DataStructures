package Stack;

import java.util.Stack;

public class Q5_nextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int n = arr.length;
        int ans[] = findAns(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }

    static int[] findAns(int arr[], int n) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>-1;i--)
        {
            int curn = arr[i];
            while(!st.isEmpty() && curn>st.peek())
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

        return ans;
    }
}
