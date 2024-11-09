package oct.ex_14102024_Abstraction.RealExample2;

public class TataTiago extends Engine{
    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Car");
    }
}
