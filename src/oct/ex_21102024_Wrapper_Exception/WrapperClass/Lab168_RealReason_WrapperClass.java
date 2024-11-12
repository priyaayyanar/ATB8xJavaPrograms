package oct.ex_21102024_Wrapper_Exception.WrapperClass;

public class Lab168_RealReason_WrapperClass {
    public static void main(String[] args) {
        String s = "10";
        //int i = s; -> Non-Primitive to Primitive is not possible
        Integer i = Integer.valueOf(s); // hence achieved NP to P
        System.out.println(i);
        int i1 = i; // Unboxing -> Integer to primitive data type
        System.out.println(i1);

        //String to Primitive
        String s1 = "15";
        int i2 = Integer.parseInt(s1); // Non-Primitive to Primitive
        System.out.println(i2);
    }
}
