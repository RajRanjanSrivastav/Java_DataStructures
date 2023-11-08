package Array;
public class trapedwater {
    public static void main(String[] args) {
        int arr[] ={4,2,0,6,3,2,5};
        System.out.println(findTrappedwater(arr,arr.length));
    }
    public static int findTrappedwater(int arr[],int n)
    {   
        int trapwtr=0;

        // for left maximum height
        int leftmax[]= new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
            // System.out.print(leftmax[i]+" ");
        }

        // for right max height

        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1], arr[i]);
            // System.out.print(rightmax[i]+" ");
        }

        // waterlevel
        // int wtr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
           int wtr=Math.min(leftmax[i],rightmax[i]);
           trapwtr +=wtr-arr[i];
        }
        return trapwtr;
    }
}
