package sept.ex_16092024;

public class Lab037_LogicalOperator {
    public static void main(String[] args) {
        // ! (logical nor gate), && ( logial AND gate), || (logical OR gate)
        boolean a = true;
        boolean b = false;
        boolean c = true && false;
        System.out.println(c);
        boolean d = true || false;
        System.out.println(d);
        System.out.println(!d);
    }
}
