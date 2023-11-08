// import org.w3c.dom.TypeInfo;

public class typwPromotion {
    public static void main(String[] args) {
        // all char byte and short convert into int when it involves in any expression
        char a ='a';
        short b = 24;
        byte c = 45;
        int ans = a+b+c;
        System.out.println((a+b+c));
        System.out.println(ans);

        long e= 642;
        double f = 56.08d;
        float g = 87.0f;
       
        System.out.println(e+f+g);

    }

    
}
