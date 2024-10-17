package sept.ex_18092024;

public class Lab058_Inc_quiz {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // Part A -> ++a, Exp1 = 11, a = 11
        // Part B -> a++, a = 11, Exp2 = 12
        // Part C -> a++, a = 12, Exp2 = 13
    }
}
