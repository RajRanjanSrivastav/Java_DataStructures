package FUNCTION;

import java.util.Scanner;

public class binomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = factOf(n);
        int rfact = factOf(r);
        int nrfact = factOf(n-r);
        System.out.println(nfact);
        System.out.println("The answer is "+nfact/(rfact*nrfact));
        sc.close();
    }

    public static int factOf(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int fact = n*factOf(n-1);
        return fact;
    }
}
