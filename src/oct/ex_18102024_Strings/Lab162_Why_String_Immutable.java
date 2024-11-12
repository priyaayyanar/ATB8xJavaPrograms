package oct.ex_18102024_Strings;

public class Lab162_Why_String_Immutable {
    public static void main(String[] args) {
        String str1="Hello";
        String str2 = " World";
        String str3 = "Hello";
        System.out.println(str1.concat(str2));
        System.out.println(str3); //

    }
}
