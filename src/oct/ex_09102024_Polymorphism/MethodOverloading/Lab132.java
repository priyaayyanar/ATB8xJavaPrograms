package oct.ex_09102024_Polymorphism.MethodOverloading;

public class Lab132 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int result = m.add(5,5);
        System.out.println(result);

        String name = m.add("Priya", "Ayyanar");
        System.out.println(name);
    }
}
