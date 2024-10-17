package sept.ex_18092024;

public class Lab056_post_pre_ex {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // Line No | value of a | expression
        // 5       | 10         | NA
        // 6       | 12           | 10 + 12 =22

    }
}
