package sept.ex_23092024;

public class Lab079_UseCase {
    public static void main(String[] args) {
        //Web Automation
        //I will ask user which browser you want me to run the code?
        //chrome -> execute the code of chrome
        //firefox -> execute the code of firefox
        //edge -> execute the code of edge
        String browser = "chrome";
        switch (browser)
        {
            case "chrome":
                System.out.println("Starting the chrome browser");
                //further code to start the chrome
                //Webdriver driver = new Chrome(); ->selenium code
                break;
            case "firefox":
                System.out.println("Starting the Firefox browser");
                //further code to start the firefox
                //Webdriver driver = new Firefox(); ->selenium code
                break;
            case "edge":
                System.out.println("Starting Edge browser");
                //further code to start the chrome
                //Webdriver driver = new Edge(); ->selenium code
                break;
            default:
                System.out.println("I have no idea which browser is it?");
                break;
        }
    }
}
