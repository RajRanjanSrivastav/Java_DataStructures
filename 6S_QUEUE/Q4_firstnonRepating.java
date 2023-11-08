package S_QUEUE;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Q4_firstnonRepating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        System.out.println(findAns(str));
        sc.close();
    }

    static String findAns(String str)
    {
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);

            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {
               q.remove();
            }

            if(q.isEmpty())
            {
                sb.append(-1+" ");
            }
            else{
                sb.append(q.peek()+" ");
            }
        }
        return sb.toString();
    }
}
