import java.util.Arrays;
import java.util.Comparator;

class B_functionalknapsak{
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int capcity=50;
        int Maxvalue=0;

        double ratio[][] = new double[val.length][2];

        //ratio array is formed
        for(int i =0;i<val.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]= val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        for(int i=0;i<ratio.length;i++)
        {
            for(int j=0;j<ratio[0].length;j++)
            {
                System.out.print(ratio[i][j]+" "); 
            }
           System.out.println();
        }

        //for maxvalue
        for(int i=ratio.length-1;i>-1;i--)
        {
            int idx = (int)ratio[i][0];
            System.out.println(idx);
            if(capcity>=weight[idx])
            {
               Maxvalue += val[idx];
               capcity -= weight[idx];
               System.out.println(Maxvalue+"-->"+capcity);
            }
            else{
               System.out.println(Maxvalue+"-->"+capcity);
               int a = (int)(ratio[i][1]*capcity);
               
               Maxvalue += a;
               System.out.println(Maxvalue+"-->"+a);
               capcity=0;
               break;
            }
        }

        System.out.println("this is the answer "+ Maxvalue);



    }
}