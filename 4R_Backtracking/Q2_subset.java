package R_Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Q2_subset {
    public static void main(String[] args) {
        String str ="ab";
        ArrayList<String> ans =new ArrayList<>();
        System.out.println( findSubset2(str,ans,"",0));
    }

    static void findSubset(String str , String ans, int i)
    {
        //base case
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //kaam
        findSubset(str, ans+str.charAt(i), i+1);
        findSubset(str, ans, i+1);
    }

    static ArrayList<String> findSubset2(String str ,ArrayList<String> ans ,String tmp , int i)
    {
      
        //base case

        if(i==str.length())
        {
            ans.add(tmp);
            return ans;
        }


        //kaam
        findSubset2(str,ans, tmp+str.charAt(i), i+1);
        findSubset2(str,ans, tmp, i+1);

        Collections.sort(ans);
        return ans;
    }
}
