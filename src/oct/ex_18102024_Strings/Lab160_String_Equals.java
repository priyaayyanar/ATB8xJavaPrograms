package oct.ex_18102024_Strings;

public class Lab160_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s4 = "Hello";
        String s5 = new String("hello");

        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1 == s4); // true
        //as in SCP if the values are same then it gives the same reference

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s4.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
