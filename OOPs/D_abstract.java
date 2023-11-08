package OOPs;

public class D_abstract {
    public static void main(String[] args) {
        Fish fi = new Fish();
        fi.walk();
        fi.eat();
            
    
    }
}

abstract class Animal   //can't make object from abstract class.... you can by the help of subclass
{
  abstract void walk();
  public void eat()
  {
    System.out.println("animal eats food");
  }
}

class Fish extends Animal{
   void walk()
   {
    System.out.println("fish can swim");
   }
}
