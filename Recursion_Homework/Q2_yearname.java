package Recursion_Homework;

public class Q2_yearname {
    public static void main(String[] args) {
        int year = 022;
        printDigits(year);
    }

   static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    // private static void writeYear(int year)
    // {
    // // base case
    // if(year==0)
    // {
    // return;
    // }

    // // kaam

    // int i = year%10;
    // // year /=10;
    // writeYear(year/10);
    // System.out.print(arr[i]+" ");
    // }

    public static void printDigits(int number) 
    {
        if(number==0)
        {
            return;
        }
        int lastDigit=number%10;

        printDigits(number/10);
        System.out.print(arr[lastDigit]+" ");
    }
}
