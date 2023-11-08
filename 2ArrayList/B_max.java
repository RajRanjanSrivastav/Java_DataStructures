package ArrayList;

import java.util.ArrayList;
public class B_max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(21);
        list.add(41);
        list.add(13);
        list.add(12);

        int max = 0;

        for(int i=0;i<list.size();i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);
            }
        }
        System.out.println("greatest element of the list is "+ max);
    }
}
