package Recursion;

public class Q3_isArrsorted {

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        System.out.println( isArrSorted(arr,0) );
    }
    
    static boolean isArrSorted(int arr[],int i)
    {
        // base case

        if(i==arr.length-1) return true;

        if(arr[i]>arr[i+1]) return false;
        return isArrSorted(arr, i+1);

    }
}
