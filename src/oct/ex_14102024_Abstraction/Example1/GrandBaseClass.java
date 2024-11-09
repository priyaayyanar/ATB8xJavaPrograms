package oct.ex_14102024_Abstraction.Example1;

// GrandBaseClass -> BaseClass -> ChromeTC, FireFoxTC
public abstract class GrandBaseClass {

    abstract void screen_shot();
    void noBodyKnowsWhereAmI_Present(){
        System.out.println("Can't get me!");
    }

}
