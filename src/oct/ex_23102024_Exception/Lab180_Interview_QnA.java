package oct.ex_23102024_Exception;

public class Lab180_Interview_QnA {
    public static void main(String[] args) {
        try {
            String s1 = "priya";
            String a1 = args[0]; //As we didn't give the i/p, it ends up with Index bound Exception
            int a = 10/0; // ArithmeticException
            s1 = null;
            System.out.println(s1.trim());// NullPointerException
        } catch (Exception e) {
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of the program");
        }

    }
}
