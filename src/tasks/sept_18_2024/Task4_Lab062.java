package tasks.sept_18_2024;

public class Task4_Lab062 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println( a-- + a--  + a--);
        System.out.println(a);
        // Part A -> a--, a = 10, Exp1 = 9
        // Part B -> a--, a = 9, Exp2 = 8
        // Part C -> a--, a = 8, Exp2 = 7
        // A(a) + B(a) + C(a)
        // 10 + 9 + 8 = 27
        // Resultant stored value of a = 7
    }

}
