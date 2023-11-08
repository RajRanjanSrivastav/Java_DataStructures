package SORTING;

public class B_selectionsort {
    public static void main(String[] args) {
        int arr[]={5,3,2,8,1};
        selctionSort(arr);
        displayArr(arr);
    }

    public static void selctionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++)

              {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
              }

             //swaping
             int temp= arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
             
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
