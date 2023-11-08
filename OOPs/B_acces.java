package OOPs;

public class B_acces {
    public static void main(String[] args) {
        Bankacc user1 = new Bankacc();
        user1.username="raj";
        System.out.println(user1.username);
        user1.setPass("rrsraj");
        // System.out.println(user1.password);
        user1.showPass();
    }
}

class Bankacc{
    public String username;
    private String password; // we can't access it from outside class

    void setPass(String password)
    {
        this.password = password;
        
    }
    void showPass()
    {
        System.out.println(password);
    }

}
