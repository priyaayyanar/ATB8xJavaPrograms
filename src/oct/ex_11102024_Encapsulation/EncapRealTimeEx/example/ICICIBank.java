package oct.ex_11102024_Encapsulation.EncapRealTimeEx.example;

public class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName(boolean are_you_admin) {
        if(are_you_admin){
            return name;
        }else {
            return "Null";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
        if(isAdmin){
            System.out.println("Only Admin allowed to set the balance ");
            this.bal = bal;
        }else {
            System.out.println("Not Allowed");
        }

    }
}
