package tasks.sept_18_2024;

public class Task3_Lab061 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(  --a + a++ + a--);
        System.out.println(a);
        // Part A -> --a, Exp1 = 9, a = 9
        // Part B -> a++, a = 9, Exp2 = 10
        // Part C -> a--, a = 10, Exp2 = 9
        // A(a) + B(a) + C(a)
        // 9 + 9 + 10 = 28
        // Resultant stored value of a = 9
    }
}
