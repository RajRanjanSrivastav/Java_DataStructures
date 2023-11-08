// conversion happen:
// a)=> type compatible
// b)=> destination type > source type
// byte -> short -> int -> float -> long -> double

class typeconversion{
    public static void main(String[] args) {
        int a = 29;
        long b = a;
        
        // long a = 29;
        // int b = a;   /* this line throw error of incompatible types */
        System.out.println(b);
    }
}