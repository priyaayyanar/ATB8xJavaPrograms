package oct.ex_21102024_Wrapper_Exception.Exception;

public class Lab170_Exception {
    public static void main(String[] args) {
        System.out.println("Starting a Program:");
        //String ip = args[0]; //10
        String ip = args[0];
        String ip1 = args[1];
        String ip2 = args[2];
        //String ip3 = args[3]; -> ArrayIndexOutOfBoundsException
        System.out.println(ip);
        System.out.println(ip1);
        System.out.println(ip2);
    }
}
