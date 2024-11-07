package oct.ex_11102024_Encapsulation.SuperKeyword;

public class TestCase1 extends BaseClass{
    TestCase1(){
        super();
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Our own Logic");
        super.setBrowser(browser, isAuth);
    }
}
