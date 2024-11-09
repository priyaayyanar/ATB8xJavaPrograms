package oct.ex_14102024_Abstraction.Example1;

public class Lab144 {
    public static void main(String[] args) {

        CHROME_TC c = new CHROME_TC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.screen_shot();
        c.noBodyKnowsWhereAmI_Present();

        FIREFOX_TC f = new FIREFOX_TC();
        f.openBrowser("firefox");
        f.closeBrowser("firefox");
    }
}
