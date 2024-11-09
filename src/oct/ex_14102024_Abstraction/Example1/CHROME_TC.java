package oct.ex_14102024_Abstraction.Example1;

public class CHROME_TC extends BaseClass{
    @Override
    void openBrowser(String browser) {
        System.out.println("Open Chrome");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close Chorme");
    }
}
