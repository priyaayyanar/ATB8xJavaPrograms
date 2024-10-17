package tasks.sept_18_2024;

public class Task2_Lab060 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(  --a + a --  + a--);
        System.out.println(a);
        // Part A -> --a, Exp1 = 9, a = 9
        // Part B -> a--, a = 9, Exp2 = 8
        // Part C -> a--, a = 8, Exp2 = 7
        // A(a) + B(a) + C(a)
        // 9 + 9 + 8 = 26
        // Resultant stored value of a = 7
    }
}
