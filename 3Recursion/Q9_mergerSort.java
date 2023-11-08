package Recursion;

//O(logn)-------->time
//O(n) ---------->space

public class Q9_mergerSort {
    public static void main(String[] args) {
        int arr[]= {2,1,6,3,9,11,5};
        int si = 0;
        int li = arr.length-1;
        mergeSort(arr,si,li);
        printArr(arr);
    }

    static void printArr(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    static void mergeSort(int arr[],int si,int li)
    {
        // base case
        if(si>=li) return;
 

        //kaam
        int mid = si + (li-si)/2;

        mergeSort(arr, si, mid);      //left part ke liye hai
        mergeSort(arr, mid+1, li);   //right part ke liye hai
        mergeAll(arr,si,li,mid);

    }
    
    static void mergeAll(int arr[],int si,int li,int mid)
    {
        int temp[]=new int[li-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=li)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // remaning part of the left side
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        
        // remaning part of the right side
        while(j<=li)
        {
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
            
        }
    }

}
