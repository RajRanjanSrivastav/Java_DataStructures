package Stack;

import java.util.Stack;

public class Q4_stockSpan {
    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int ans[]=findSpan(price, n);

        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
        // System.out.println(ans.toString());

    }

    static int[] findSpan(int arr[], int n) {
        int span[] = new int[n];
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            int curn = arr[i];
            while (!st.isEmpty() && curn >= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            st.push(i);
        }
        return span;
    }
}
