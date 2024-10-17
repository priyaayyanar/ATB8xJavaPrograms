package sept.ex_18092024;

public class Lab048_Example1 {
    public static void main(String[] args) {
        long ph_no = 9876543210L;
        //short s = ph_no; -> Implicit - Narrowing - Invalid
        short s = (short) ph_no; // Explicit - Narrowing - Valid
        System.out.println(s);


    }
}
