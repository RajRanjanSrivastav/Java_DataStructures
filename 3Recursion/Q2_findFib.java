package Recursion;

public class Q2_findFib {
    public static void main(String[] args) {
        int n=6;
        System.out.println( findFib(n) );
        // printFib(n);
        
    }

    static int findFib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1 || n==2)
        {
            return 1;
        }
        int ans = findFib(n-1)+findFib(n-2);
        
        return ans ;
    }

    // static void printFib(int n)
    // {
    //     if(n==0)
    //     {
    //         return 0;
    //     }
    //     if(n==1 || n==2)
    //     {
    //         return 1;
    //     }
    //     System.out.println( printFib(n-1) + printFib(n-2) );
        
    // }
}
