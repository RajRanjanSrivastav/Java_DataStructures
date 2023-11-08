package Stack;

import java.util.Stack;

public class Q8_maxAreaHistogram {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.println(findAns(arr));
    }

    static int findAns(int arr[])
    {
        int max = 0;
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int nsl[]=new int[n];
        int nsr[]=new int[n];

        //next smaller in right
        for(int i=n-1;i>-1;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nsr[i]=n;
            }
            else{
                nsr[i]=st.peek();
            }
            st.push(i);
        }

        st = new Stack<>();
        //next smaller in left
        for(int j=0;j<n;j++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[j])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nsl[j]=-1;
            }
            else{
                nsl[j]=st.peek();
            }
            st.push(j);
        }


        

        //for max area
        for(int i=0;i<n;i++)
        {
            int width = nsr[i]-nsl[i]-1;
            int area = arr[i]*width;
            max = Math.max(area,max);
        }
       
        return max;
    }
}
