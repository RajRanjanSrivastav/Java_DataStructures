package Array;

public class stockprofit {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int arr[])
    {
        int minval=arr[0];
        int max=0;

        for(int i = 1;i<arr.length;i++)
        {
            if(minval<arr[i])
            {
               int profit = arr[i]-minval;
               max = Math.max(max, profit);
            }
            else
            {
               minval=arr[i];
            }
        }
        return max;
    }
}
