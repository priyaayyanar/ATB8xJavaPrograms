package tasks.sept_20_2024;

public class Task1 {
    public static void main(String[] args) {
        //By using Ternary Operators max between 3 numbers.
        //
        // Input int - a,b,c - a = 10, b = 20, c = 45
        //
        // Max → a,b,c → c
        int a, b, c, max1, max2;
        a = 10;
        b = 20;
        c = 45;
        max1 = (a > b) ? a : b ;
        max2 = (max1 > c) ? max1 : c ;
        System.out.println("The Maximum number is : "+ max2);
    }
}
