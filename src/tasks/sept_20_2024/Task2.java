package tasks.sept_20_2024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Ternary Operators to handle multiple conditions.
        //
        // Input → int score = 85
        //
        // String grade →
        //
        //  score >= 90 → A
        //  score >= 80 → B
        //  score >= 70 → C
        System.out.println("Enter the mark : " );
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F" ;
        System.out.println(grade);
    }
}
