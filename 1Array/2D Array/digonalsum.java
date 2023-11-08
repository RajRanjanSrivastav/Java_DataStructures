

public class digonalsum {
    
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5},
                         };

        
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                    {9,10,11,12}};

        // printSum(matrix);

        findEle(arr,11);
    }

    public static void printSum(int [][]arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
          sum+=arr[i][i];
          
          if(i!=arr.length-1-i)
            sum+=arr[i][arr.length-1-i];
        }
        System.out.println(sum);
    }

    static void findEle(int arr[][],int key)
    {
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0)
        {
           if(arr[row][col]==key)
           {
              System.out.println("element found at index "+row+", "+col);
              return;
           }
           else if(key<arr[row][col])
          {
            col--;
          }
          else{
            row++;
          }
        }
    }
}
