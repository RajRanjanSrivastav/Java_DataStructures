package ArrayList;

import java.util.ArrayList;

public class C_swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(22); 
        list.add(12); 
        list.add(29);

        System.out.println(list);
        swap(list,2,4);
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list,int i,int j)
    {
       int temp = list.get(i);
       list.set(i,list.get(j));
       list.set(j,temp);
    }
}
