package sept.ex_18092024;

public class Lab047_Narrowing {

    public static void main(String[] args) {
        //Narrowing
        int val = 200;
        // byte b1 = val; ->  invalid - Implicit casting
        byte b2 = (byte)val; // valid - Explicit casting - with loss of data
        System.out.println(b2);

    }
}
