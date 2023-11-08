package String;

import java.util.Scanner;


public class B_shortestpath 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findShort(str));
        sc.close();
    }

    public static int findShort(String str)
    {
       int ans=0;
       int x=0;
       int y=0;
       for(int i=0;i<str.length();i++)
       {
          if(str.charAt(i)=='N')
          {
            y++;
          }
          else if(str.charAt(i)=='S')
          {
            y--;
          }
          else if(str.charAt(i)=='E')
          {
            x++;
          }
          else{
            x--;
          }
       } 
       ans = (int) Math.sqrt((x*x)+(y*y));
       return ans;
    }
}
