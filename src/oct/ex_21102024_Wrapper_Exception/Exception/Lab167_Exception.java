package oct.ex_21102024_Wrapper_Exception.Exception;

public class Lab167_Exception {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End of the program");

        //If there is no problem then the O/P is 100 and return code 0.

        //If the I/P is Priya instead of any number,then it will throw a
        // NumberFormatException

        //If the I/P is 0 then it returns
        // ArithmeticException.

        //If the I/P is just a space " " then it will return -
        //ArrayIndexOutOfBoundsException

        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab170_Exception.main()
        //Now Control will be transferred from main Thread to main method

        // When problem comes in main -> JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program.

    }
}
