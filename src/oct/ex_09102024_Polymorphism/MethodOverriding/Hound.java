package oct.ex_09102024_Polymorphism.MethodOverriding;

public class Hound extends Dog{
    @Override // IntelliJ automatically override the superclass behavior.
            // Its better to use annotation
    void bark(){
        System.out.println("Hound - Bark");
    }
}
