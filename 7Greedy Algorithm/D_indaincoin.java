import java.util.ArrayList;

public class D_indaincoin {
    public static void main(String[] args) {
        int coin[]={2000,500,100,50,20,10,5,2,1};
        int amount = 590;

        int cnt=0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<coin.length;i++)
        {
            if(coin[i]<=amount)
            {
                while(coin[i]<=amount)
                {
                    cnt++;
                    list.add(coin[i]);
                    amount -= coin[i];
                }
            }
            if(amount==0)
            {
                break;
            }
        }

        System.out.println("total numer of coins is: "+cnt+" And all the coins is " +list);
    }
}
