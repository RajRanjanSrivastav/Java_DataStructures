package ArrayList;

import java.util.ArrayList;

class A_operation{
   
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //operations

        //add
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
 
        //get
        System.out.println(list.get(3));

        //set 
        list.set(3,11);

        //add element at index
        list.add(2,13);

        //remove
        list.remove(3);

        //contains 
        System.out.println(list.contains(11));
        System.out.println(list.contains(21));

        
        System.out.println(list);
    }
}