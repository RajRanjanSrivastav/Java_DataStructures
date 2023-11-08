package ArrayList;

import java.util.ArrayList;

public class D_containmostwater {
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);

        System.out.println(maxWater(list));
    }

    static int maxWater(ArrayList<Integer> list)
    {
        int ans=0;
        // for(int i=0;i<list.size();i++)
        // {
        //     for(int j=i+1;j<list.size();j++)
        //     {
        //        int ht = Math.min(list.get(i),list.get(j));
        //        int wth = j-i;
        //        int crn = ht*wth;
        //        ans = Math.max(ans,crn);
        //     }
        // }

        //two pointer approch
        int left=0;
        int right=list.size()-1;
        while(left<right)
        {
            int curn=0;
            if(list.get(left)<list.get(right))
            {
              int wi=right-left;
              curn=list.get(left)*wi;
              left++;
            }
            else{
              int wi=right-left;
              curn=list.get(right)*wi;
              right--;
            }

            ans=Math.max(ans,curn);

        }

        return ans;
    }
}

