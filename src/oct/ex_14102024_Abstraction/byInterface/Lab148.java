package oct.ex_14102024_Abstraction.byInterface;

public class Lab148 {
    public static void main(String[] args) {
        //XYZ hides ABC and ABC hides Interfaces 1 & 2
        XYZ xyz = new XYZ();
        xyz.display();
    }
}

class XYZ{
    void display(){
        new ABC().f4();
    }
}
class ABC implements I1,I2{

    @Override
    public void f1() {
        System.out.println("f1");
    }

    @Override
    public void f2() {
        System.out.println("f2");
    }

    @Override
    public void f3() {
        System.out.println("f3");
    }

    @Override
    public void f4() {
        System.out.println("f4");
    }
}
interface I1{
    void f1();
    void f2();
}

interface I2{
    void f3();
    void f4();
}