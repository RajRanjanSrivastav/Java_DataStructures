package Recursion;

public class Q6_tillingProb {
    public static void main(String[] args) {
        // int flo_b=2;
        int flo_l=5;
        // int t_l=1;
        // int t_b=2;
        // in n=4;
       System.out.println( findWay( flo_l) );
    }

    static int findWay( int fl)
    {
        // base case
        if(fl==0 || fl==1)
        {
            return 1;
        }
        return findWay( fl-1) + findWay( fl-2);


    }
}
