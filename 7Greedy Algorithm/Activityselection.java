import java.util.ArrayList;

public class Activityselection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        //creatin for answer
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //selction first activity
        maxAct=1;
        ans.add(0);
        int lastEnd = end[0];

        //traverse for all
        for(int i=1;i<start.length;i++)
        {
            if(start[i]>=lastEnd)
            {
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }

        //Answer
        System.out.println(maxAct);
        System.out.println(ans);
        
        // for(int i=0;i<maxAct;i++)
        // {
        //     System.out.println(ans.get(i));
        // }
    }
}
