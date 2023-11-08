package Recursion;


public class Q5_findPow {
    public static void main(String[] args) {
        System.out.println(pow(2,6));
    }
    static int pow(int x,int n)
    {
        // O(n) time complexity

        // base case
        // if(n==0)
        // {
        //     return 1;
        // }

        // return x*pow(x, n-1);


        // ----takes O(logn)-----
        // base case
        // if(n==0) return 1;  
      
        // int ans = pow(x,n/2)*pow(x, n/2);

        // // if the power is odd
        // if(n%2!=0)
        // {
        //     ans = ans*x;
        // }
        // return ans;


        //the below code is more optimized beacause the above code call the same function 2 times

        // base condition
        if(n==0)
        {
            return 1;
        }

        int ans = pow(x, n/2);
        // for even
        if(n%2==0) 
        {
            ans= ans*ans;
        }
        else{
            ans= x*ans*ans;
        }
        
        return ans;
    }
}
