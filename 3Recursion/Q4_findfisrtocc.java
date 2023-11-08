package Recursion;

public class Q4_findfisrtocc {
    public static void main(String[] args) {
        // int arr[]={2,4,1,5,33,8,6,90,2,12};;
        // int key =2;
        int arr[]={1,2,5,3,5,8};
        int key=5;
        // System.out.println(findFirstOcc(arr,0,key));
        System.out.println(findLastOcc(arr,0,key));

    }

    static int findFirstOcc(int arr[],int i,int key)
    {
        //  base case
        if(i==arr.length) return -1;

        if(arr[i]==key) return i;

        return findFirstOcc(arr, i+1, key);
    }

    static int findLastOcc(int arr[],int i,int key)
    {
        //base case
        // if(i==-1) return -1;

        // if(arr[i]==key) return i;
        // return findLastOcc(arr, i-1, key);

        if(i==arr.length)return -1;
        int find = findLastOcc(arr, i+1, key);

        // if(find!=-1)
        // {
        //     return find;
        // }
        // if(arr[i]==key)
        // {
        //     return i;
        // }

        if(find==-1 && arr[i]==key)
        {
            return i;
        }
        return find;
    }

}
