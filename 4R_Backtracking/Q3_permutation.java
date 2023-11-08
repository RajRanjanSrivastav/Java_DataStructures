// package R_Backtracking;

public class Q3_permutation {

    public static void main(String[] args) {
        String str = "abc";
        findPer(str,"");
    }

    static void findPer(String str, String ans)
    {
        //base case
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        //kaam

        for(int i=0;i<str.length();i++)
        {
            char curn = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPer(Newstr, ans+curn);
        }
    }
}
