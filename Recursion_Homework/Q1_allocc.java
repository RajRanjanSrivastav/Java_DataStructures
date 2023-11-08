package Recursion_Homework;

public class Q1_allocc {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,6,2,2,5,2,0,2};
        int key = 2;
        // int ans[]=new int[10];
        // System.out.println(findAllOcc(arr,0,key,ans,0));
        findAllOcc(arr, key, 0);
    }
    // private static String findAllOcc(int arr[],int idx,int key,int ans[],int ansidx)
    private static void findAllOcc(int arr[],int key,int idx)
    {
        //base case
        if(idx==arr.length)
        {
            // return ans.toString();
            return;
        }

        // kaam
        if(arr[idx]==key)
        {
            System.out.print(idx+" ");
          
            // ans[ansidx]=idx;
            // findAllOcc(arr, idx+1, key, ans, ansidx+1);
        }
        // findAllOcc(arr, idx+1, key, ans, ansidx);
        findAllOcc(arr, key, idx+1);


        // return ans.toString();
    }
}
