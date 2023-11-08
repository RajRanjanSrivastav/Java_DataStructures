package OOPs;

public class A_basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("yelllow");
        p1.setTip(8);
        System.out.println(p1.color+" "+p1.tip);
    }
    
}

class Pen
{
   String color;
   int tip;

   void setColor(String newcolor)
   {
     color = newcolor;
   }

   void setTip(int newtip)
   {
    tip=newtip;
   }

}
