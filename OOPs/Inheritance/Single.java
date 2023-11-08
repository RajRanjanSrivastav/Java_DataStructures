package OOPs.Inheritance;

public class Single 
{
        public static void main(String[] args) 
        {
            // Animal a1 = new Animal();
            // a1.eats();
           
            // a1.name="hellop";
            // a1.grow();

            // Fish shark = new Fish();
            // shark.name="babu shark";
            // shark.eats();
            // shark.grow();
            // shark.walk();
            
        }
}
    
class Animal
{
        static String name;
    
        static void eats()
        {
            System.out.println("Yes it eats");
        }
    
        static void grow()
        {
            System.out.println("yes it can "+ name);
        }
}

class Fish extends Animal
{
    static void walk()
    {
        System.out.println("chalo yhan se chall rha hai "+ name);
    }
}

