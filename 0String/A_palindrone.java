package String;
import java.util.Scanner;

public class A_palindrone 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the string");
        String str = sc.nextLine();
        System.out.println(checkPalin(str));
        sc.close();
    }
 
    static boolean checkPalin(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    
}
