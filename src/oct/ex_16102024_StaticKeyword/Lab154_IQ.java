package oct.ex_16102024_StaticKeyword;

public class Lab154_IQ {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        new A();
        A c;
    }


}
class A{
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }
}
