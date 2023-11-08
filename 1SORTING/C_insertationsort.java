package SORTING;

public class C_insertationsort {
    public static void main(String[] args) {
        int arr[]={9,1,6,2,8,5};
        insertationSort(arr);
        displayArr(arr);

    }
    public static void insertationSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr = arr[i];
            int prev=i-1;

            // finding the correct position
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }

            // insert at correct position
            arr[prev+1]=curr;
        }
    }

    public static void displayArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
