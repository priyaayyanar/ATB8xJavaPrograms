package oct.ex_14102024_Abstraction.Example1;

public class FIREFOX_TC extends BaseClass{
    @Override
    void openBrowser(String browser) {
        System.out.println("Open FireFox");
    }
    @Override
    void closeBrowser(String browser) {
        System.out.println("Close FireFox");
    }
}
