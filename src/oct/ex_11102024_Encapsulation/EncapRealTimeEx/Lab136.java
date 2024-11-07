package oct.ex_11102024_Encapsulation.EncapRealTimeEx;

public class Lab136 {
    public static void main(String[] args) {
        System.out.println("Credential Without any Protection");
        badLogin l = new badLogin("admin", "admin123");
        System.out.println("User Name : "+ l.userName);
        System.out.println("Password : "+ l.password);
        System.out.println("Now the hacker is able to access the password and modified it.");
        l.password = "hacker";
        System.out.println("Password : "+ l.password);
        System.out.println("--------------------------");
        System.out.println("Credential with Protection(Encapsulation)");
        GoodLogin g = new GoodLogin("admin","admin123");
        System.out.println("User Name : "+ l.userName);
        System.out.println("Password : "+ l.password);
        System.out.println("Now we Encapsulated the the credential fields to Private. Hence the outsiders couldn't modify the password field.");
        //g.password = "hacker";
        //after using getter and setter methods.
        boolean isAdmin = false;
        System.out.println(g.getPassword());
        g.setPassword("newPassword", isAdmin);
        System.out.println(g.getPassword());



    }
}
