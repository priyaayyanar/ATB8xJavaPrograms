package oct.ex_21102024_Wrapper_Exception.WrapperClass;

public class Lab166 {
    public static void main(String[] args) {
        //Primitive to Wrapper Class
        int a = 10;
        Integer i = a;
        System.out.println(i);
        System.out.println(Integer.MAX_VALUE);// without object - Static variables.
        System.out.println(Integer.MIN_VALUE);

        Integer i1 = 10;
        int b = i1; //Unboxing
        System.out.println(b);

    }
}
