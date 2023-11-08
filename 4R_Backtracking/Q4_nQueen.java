package R_Backtracking;

public class Q4_nQueen {
    public static void main(String[] args) {
        int n=4;
        String board[][]=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]="X";
            }
        }
        findSol(board,0);

    }

    static void findSol(String board[][],int row)
    {
        //base case
        if(row==board.length)
        {
            printArr(board);
            return;
        }

        //kaam
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]="Q";
                findSol(board,row+1);
                board[row][j]="X";
            }
            
        }
    }

    static boolean isSafe(String arr[][],int row,int col)
    {
        //right up
        for(int i=row-1;i>=0;i--)
        {
            if(arr[i][col]=="Q")
            {
                return false;
            }
        }

        //left diagonal up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(arr[i][j]=="Q")
            {
                return false;
            }
        }

        //right diagonal up
        for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++)
        {
            if(arr[i][j]=="Q")
            {
                return false;
            }
        }

        return true;
    }

    static void printArr(String board[][])
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
           
        }
        System.out.println("-------board----------");
    }
    
}
