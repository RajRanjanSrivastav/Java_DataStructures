package Recursion;

public class Q7_removedupli {
    public static void main(String[] args) {
        String str= "rajranjansrivastav";
        System.out.println(removeDupli(str,0,new StringBuilder(""), new boolean[26]));
    }

    static String removeDupli(String str , int idx, StringBuilder newstr , boolean map[])
    {

        // base case
        if(idx==str.length())
        {
           return newstr.toString();
        }
        
        // kaam
        char curnchar = str.charAt(idx);

        if(map[curnchar-'a']==true)
        {
            removeDupli(str, idx+1, newstr, map);
        }
        else{
            map[curnchar-'a']=true;
            removeDupli(str, idx+1, newstr.append(curnchar), map);
        }
        

        return newstr.toString();
    }
}
