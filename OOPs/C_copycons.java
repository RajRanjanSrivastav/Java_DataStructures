package OOPs;

public class C_copycons {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "raj";
        s1.roll_no = 88;

        System.out.println(s1.name+" "+s1.roll_no);
        s1.marks[0]=100;
        s1.marks[1]=101;
        s1.marks[2]=900;
        Student s2 = new Student(s1); //copy
        s2.pass = "abs";
        System.out.println(s2.name +"  "+ s2.roll_no+" "+s2.pass);
        s2.marks[2]=90;
        System.out.println("for s1 "+ s1.marks[2]);
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
   String name;
   int roll_no;
   String pass;
   int marks[];

   Student()
   {
    marks=new int[3];
     System.out.println("constructor called");
   }

   //copy constructor
   Student(Student s1)
   {
    marks=new int[3];
    this.name=s1.name;
    this.roll_no= s1.roll_no;
    this.marks= s1.marks;
   }

}
