package oct.ex_11102024_Encapsulation.EncapRealTimeEx;

public class GoodLogin {
    private String userName;
    private String password;

    public GoodLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }
        else {
            System.out.println("Not Allowed");
        }
    }
}
