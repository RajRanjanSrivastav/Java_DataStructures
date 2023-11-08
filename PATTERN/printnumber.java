package PATTERN;

import java.util.Scanner;

public class printnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {   int cur=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(cur+" ");
                cur++;
            }
            System.out.println();  
        }
        sc.close();
    }
}
