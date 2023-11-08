package Recursion;

public class Q10_quciksort {
    public static void main(String[] args) {
        int arr[]={6,3,8,11,2,8,5};
        quicSort(arr,0,arr.length-1);
        // System.out.println(arr.toString());
        printArr(arr);
    }
    static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }

    static void quicSort(int arr[],int si,int li)
    {
        //base case
        if(si>=li)
        {
            return;
        }

        //kaam
        int piv = partition(arr,si,li);
        quicSort(arr, si, piv-1);    //this is for left side
        quicSort(arr, piv+1, li); //this is for the right side 

    }

    static int partition(int arr[],int si,int li)
    {
        int piv = arr[li];
        int i=si-1;   //this is making for the space for swapping

        for(int j=si;j<li;j++)
        {
            if(arr[j]<=piv)
            {
                i++;
                //swapping
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = piv;
        arr[li]=arr[i];
        arr[i]=temp;

        
        return i;
    }
}
