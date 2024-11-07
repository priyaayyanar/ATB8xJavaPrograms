package tasks.Oct_11_2024_Encap_Super;

public class APIAutomation {
    public static void main(String[] args) {
        BaseTestAPI t = new TestCaseAPI(); // Dynamic Dispatch
        t.HTTP("Priya", 14);
        t.setName("Pranu",true);
        BaseTestAPI b = new BaseTestAPI();
        b.HTTP("Kayal",05);
        b.setName("Kayal",false);

    }
}
