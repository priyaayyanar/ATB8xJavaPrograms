package oct.ex_09102024_Inheritance.Hierarchical;

public class Lab131 {
    public static void main(String[] args) {
        Child3 ch3 = new Child3();
        ch3.c3();
        ch3.home();

        Child2 ch2 = new Child2();
        ch2.c2();
        ch2.home();

        Child1 ch1 = new Child1();
        ch1.c1();
        ch1.home();

        Father f = new Father();
        f.home();
    }
}
