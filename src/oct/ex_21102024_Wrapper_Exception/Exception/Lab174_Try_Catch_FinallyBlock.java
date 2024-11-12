package oct.ex_21102024_Wrapper_Exception.Exception;

public class Lab174_Try_Catch_FinallyBlock {
    public static void main(String[] args) {

        int c = 1;
        try {
            c = 10/c;
            System.out.println(c);
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e);
            System.out.println("End");
        }
        //if we dont know the exact exception name then we can mention as below
        //catch (Exception e) {
        //            System.out.println(e.getMessage());
        //            System.out.println("End");
        //        }
    }
}
