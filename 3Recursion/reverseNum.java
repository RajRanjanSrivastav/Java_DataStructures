package Recursion;

public class reverseNum {
  public static void main(String[] args) {
    int arr[]={2,5,7,8,9,10};
    revNum(arr,0);
  }  

  static void revNum(int arr[],int i)
  {
    if(arr.length==i)
    {
        return;
    }
    revNum(arr,i+1);
    System.out.print(arr[i]+" ");

  }
}
