package Recursion;

class Q8_binarystring{
    public static void main(String[] args) {
        int n = 3;
        // String str = "lkasdsjf";
        System.out.println(findBinary(n,0,""));
        // findBinary(n,0,"");
        // System.out.println(str);
    }

    private static String findBinary(int n, int lp, String ans) {

        if(n==0)
        {
            
            System.out.println(ans);
            // return;
            return "";
        }

        if(lp==0)
        {
            findBinary(n-1, 0, ans+"0");
            findBinary(n-1, 1, ans+"1");
        }
        else{
            findBinary(n-1, 0, ans+"0");
        }
        return ans;
    }

    
}