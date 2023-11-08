package Array;
public class subarr{
    public static void main(String[] args) {
        int arr[] = {2,4,3,6,7};
        printAllSubarr(arr,arr.length);
    }

    public static void printAllSubarr(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
               for(int k=i;k<=j;k++)
               {
                 System.out.print(arr[k]+" ");
                 sum+=arr[k];

               }
               System.out.println();
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}