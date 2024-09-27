package sept.ex_16092024;

public class Lab040_AND_OR_Operator {
    public static void main(String[] args) {
        // || -> OR
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // && -> AND
        // T && T -> T
        // T && F -> F
        // F && T -> F
        // F && F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
