package tasks.Oct_11_2024_Encap_Super;

public class BaseTestAPI {
    private String name;
    private int id;

    BaseTestAPI(){
        System.out.println("DC : BaseTest");
    }

    public void HTTP(String name, int id) {
        System.out.println("BaseTestAPI:");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean isAdmin) {
        if(isAdmin) {
            this.name = name;
        }else {
            System.out.println("Authentication Failed");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id, boolean isAdmin) {
        if(isAdmin){
            this.id = id;
        }else {
            System.out.println("Authentication Failed");
        }
    }

    public void performPOST(){
        System.out.println("performPOST_API");
    }
    //Method Overloading
    public void performPOST(String name, int id){
        System.out.println("Method Overloading");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
    }
    public void performPATCH(){
        System.out.println("performPATCH_API");
    }
    public void performPUT(){
        System.out.println("performPUT_API");
    }
    public void performDELETE(){
        System.out.println("performDELETE_API");
    }
}
