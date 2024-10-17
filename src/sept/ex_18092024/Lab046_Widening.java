package sept.ex_18092024;

public class Lab046_Widening {

    public static void main(String[] args) {
        //Widening -> a bigger basket is used
        byte b = 10;
        int i = b; // Valid - Implicit Type casting - JVM
        int i1 = (int)b; // valid - Explicit casting
        System.out.println(i1);
    }
}
