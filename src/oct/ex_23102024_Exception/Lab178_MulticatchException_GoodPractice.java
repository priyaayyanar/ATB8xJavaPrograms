package oct.ex_23102024_Exception;

public class Lab178_MulticatchException_GoodPractice {
    public static void main(String[] args) {
        try {
            String ip = args[0]; //ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); //NumberFormatException
            int b = 100/a; //ArithmeticException
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}
