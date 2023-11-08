package ArrayList;

import java.util.ArrayList;

public class E_pairsum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        int target=29;
        System.out.println( pairSum(list,target) );

    }

    static boolean pairSum(ArrayList<Integer> list,int tg)
    {
        int lf=0;
        int rg=list.size()-1;

        while(lf<rg)
        {

        int sum=list.get(lf)+list.get(rg);
        if(sum==tg)
        {
            return true;
        }
        else if(sum<tg)
        {
            lf++;
        }
        else{
            rg--;
        }
       }
        return false;
    }
}
