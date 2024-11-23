package oct.ex_23102024_Exception;

public class Lab176 {
    public static void main(String[] args) {
        int a = 0;
        try {
            int d = 10/a;
            System.out.println(d);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new ArithmeticException();
        } finally {
            System.out.println("I will be always executed");
        }
    }
}
