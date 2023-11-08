
/**
 * impli_heaps
 */
import java.util.*;

public class impli_heaps {

    static class Heaps {
        ArrayList<Integer> list = new ArrayList<>();

        // this function is for add elements

        public void add(int data) {

            list.add(data);
            int x = list.size() - 1; // x child node
            int pr = (x - 1) / 2;
            // int cnt=1;
            while (list.get(x) < list.get(pr)) {
                int temp = list.get(x);
                list.set(x, list.get(pr));
                list.set(pr, temp);
                // cnt++;
                x = pr;
                pr = (x - 1) / 2;
                System.out.println("andar" + list);

            }
        }

        // for knnow the min elements in heap

        public int minEle() {
            return list.get(0);
        }

        // function for remove the

        public void remove(int i) {

            // first step to get the element for remove
            int ele = list.get(i);

            // second step to paced it at last

            list.set(i, list.get(list.size() - 1));
            list.set(list.size() - 1, ele);

            // third step delete element

            list.remove(list.size() - 1);
            // last step to call minHipify fucntion to make the heap correct
            minHipify(i);
        }

        // minHipify function
        public void minHipify(int i) {
            int prn = i;
            int lc = 2 * i + 1;
            int rc = 2 * i + 2;

            if (lc < list.size() && list.get(prn) > list.get(lc)) {
                prn = lc;
            }
            if (rc < list.size() && list.get(prn) > list.get(rc)) {
                prn = rc;
            }

            if (prn != i) {
                // swap
                int temp = list.get(i);
                list.set(i, list.get(prn));
                list.set(prn, temp);

                minHipify(prn);
            }
        }

        // for display the heap
        public void display() {
            for (int i = 0; i < list.size() / 2; i++) {
                int lc = 2 * i + 1;
                int rc = 2 * i + 2;

                // Printing the parent and both childrens
                System.out.print(" PARENT : " + list.get(i));
                if (lc < list.size()) {
                    System.out.print(" LEFT CHILD : " + list.get(lc));
                }
                if(rc<list.size())
                {
                    System.out.print( " RIGHT CHILD :"+ list.get(rc));
                }
                // By here new line is required
                System.out.println();
            }
        }

        // for know heap is empty or not
        public boolean isEmpty() {
            return list.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heaps hp = new Heaps();
        hp.add(3);
        hp.add(2);
        hp.add(1);
        hp.add(4);
        hp.add(6);

        hp.display();

        System.out.println(hp.minEle());

        hp.remove(3);
        hp.display();
        System.out.println(hp.minEle());

    }
}