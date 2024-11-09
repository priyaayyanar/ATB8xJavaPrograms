package oct.ex_14102024_Abstraction.Example1;

public class BaseClass extends GrandBaseClass{
    //Web Automation
    //Single Inhe
    //Hide the functionality of Open Close browser
    void openBrowser(String browser){}
    void closeBrowser(String browser){}

    @Override
    void screen_shot() {
        System.out.println("Abstract_Screen_Shot");
    }
}
