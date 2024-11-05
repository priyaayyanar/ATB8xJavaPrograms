package oct.ex_09102024_Polymorphism.MethodOverriding.Real_with_DynamicDispatch;

public class Lab134 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.home();

        Father f = new Father();
        f.home();

        // Dynamic Dispatch
        // Father ref to child object is possible
        // Child ref to Father object is impossible
        System.out.println("Dynamic Dispatch");
        Father object = new Child();
        //Father can be a reference when Child born
        object.home();

        // Child object1 = new Father();
        // Child could not be the reference when Father born

        // in Selenium
        // WebDriver driver = new ChromeDriver();  => Dynamic Dispatch

    }
}
