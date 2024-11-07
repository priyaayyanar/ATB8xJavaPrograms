package tasks.Oct_11_2024_Encap_Super;

public class TestCaseAPI extends BaseTestAPI{
        public TestCaseAPI() {
        super();
        this.setName("Priya", true);
        this.setId(14, true);
    }
    //Method Overriding
    @Override
    public void HTTP(String name, int id) {
        System.out.println("TestCaseAPI:");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
    }
}
