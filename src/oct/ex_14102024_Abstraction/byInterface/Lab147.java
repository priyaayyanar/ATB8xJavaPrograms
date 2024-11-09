package oct.ex_14102024_Abstraction.byInterface;

public class Lab147 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();
        p.f2();
        p.f3();
    }
}
interface I{
    void f1();
    void f2();
    void f3();
}
class P implements I{

    @Override
    public void f1() {
        System.out.println("P-f1");
    }

    @Override
    public void f2() {
        System.out.println("P-f2");
    }

    @Override
    public void f3() {
        System.out.println("P-f3");
    }
}
