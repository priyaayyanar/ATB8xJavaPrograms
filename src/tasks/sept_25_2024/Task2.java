package tasks.sept_25_2024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        // n = 1 ->  Fact = 1*1 -> 1
        // n = 3 -> Fact = 3*2*1 -> 6
        System.out.print("Enter the number for its Factorial representation : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1 ; i <= num ; i++){
            fact = fact * i ;
        }
        System.out.println(fact);


    }
}
