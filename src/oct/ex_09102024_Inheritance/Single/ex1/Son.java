package oct.ex_09102024_Inheritance.Single.ex1;

public class Son extends Father{

    void bhk3(){
        System.out.println("Son - 3BHK");
        // Attribute of Father
        System.out.println(gold_gm);
        // Behaviour of Father
        bhk2();
    }

}
