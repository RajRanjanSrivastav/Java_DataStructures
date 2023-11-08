package SORTING;

public class A_bubbelsort {
    public static void main(String [] args)
    {
        int arr[] ={4,3,7,1};
        bubbelSort(arr); //this takes O(n^2)

        displayArr(arr); // this takes O(n)
    }

    public static void bubbelSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    // swap
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
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
