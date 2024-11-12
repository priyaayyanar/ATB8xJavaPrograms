package oct.ex_21102024_Wrapper_Exception.Exception;

public class Lab173 {
    public static void main(String[] args) {

        // Unchecked - java.lang.NullPointerException
        // jvm - at the Runtime -> Terminated the program.

        String s1 = null;
        System.out.println(s1.trim()); //NullPointerException

    }
}
