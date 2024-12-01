package nov.ex_04112024_Generics;

public class Lab217_MultiGenerics {
    public static void main(String[] args) {
        printTs(1, "Priya", null, true);
    }

    public static <T1,T2,T3,T4> void printTs(T1 a, T2 b, T3 c, T4 d){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
