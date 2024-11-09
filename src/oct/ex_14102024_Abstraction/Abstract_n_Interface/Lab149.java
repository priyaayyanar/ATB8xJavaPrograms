package oct.ex_14102024_Abstraction.Abstract_n_Interface;

import oct.ex_11102024_Encapsulation.EncapRealTimeEx.example.ICICIBank;

public class Lab149 {
}

interface I1{
    default void start(){
        System.out.println("DefaultMethod body inside Interface");
    }
    void stop();
    void car();
    static void sm(){
        System.out.println("StaticMethod body inside Interface");
    }
}

abstract class AA{
    void f1(){
        System.out.println("ConcreteMethod inside Abstract class");
    }
    abstract void f2();
    static void f3(){
        System.out.println("StaticMethod inside Abstract class");
    }
}
