package sept.ex_18092024;

public class Lab054_post_Inc_example {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        //  Line No | a | b
        // 5        | 10| _
        // 6        | 11 | 10
        // 7        | 11
        // 8        |    | 10

    }
}
