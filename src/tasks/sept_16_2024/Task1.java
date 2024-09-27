package tasks.sept_16_2024;

public class Task1 {
    public static void main(String[] args) {
        //Difference between = and  ==?

        // = -> unary assignment operator which assigns right side value to the left side variable
        //ex:
        int a = 10; // 10 is assigned to variable a
        System.out.println(a);

        // == -> double equals operator is a type of Relational Operator in Java used to check for relations of equality of 2 operands.
        //always returns boolean result (true or false)
        //ex:
        int b = 5;
        int c = 5;
        System.out.println(b == c);
        System.out.println(a == b);
    }
}
