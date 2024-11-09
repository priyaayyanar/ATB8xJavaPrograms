package oct.ex_14102024_Abstraction.Abstract_n_Interface;

public class Lab150 {
}
interface I5{}
interface I6{}
class A{}
class B{}
class Test1 extends A{}
//class Test2 extends A,B{}
class Test3 implements I5{}
class Test4 implements I5,I6{}
class Test5 extends A implements I5, I6{}
//class Test6 implements I5 extends A{}

//extends always comes first before the implements.
// Inheritance first Interface next
