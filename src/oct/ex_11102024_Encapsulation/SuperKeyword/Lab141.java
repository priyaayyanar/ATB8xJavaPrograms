package oct.ex_11102024_Encapsulation.SuperKeyword;

public class Lab141 {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1(); //Dynamic Dispatch
        t1.openBrowser();
        t1.closeBrowser();
        t1.openBrowser("edge");
        t1.closeBrowser();
    }
}
