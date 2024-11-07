package oct.ex_11102024_Encapsulation.EncapRealTimeEx.example;

public class Lab137 {
    public static void main(String[] args) {
        ICICIBank priya = new ICICIBank("Priya", 1000);
        //boolean isAdmin = true;
        System.out.println(priya.getBal());

        //changes in setter() - Only for Admin.
        boolean are_you_admin = true;
        ICICIBank admin = new ICICIBank("admin", 5000);
        admin.setBal(7000, true);
        System.out.println(admin.getName(true));
        System.out.println(admin.getBal());

    }
}
