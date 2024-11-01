package tasks.sept_30_2024;

import java.util.Scanner;

public class Task1_Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for its Factorial representation : ");
        int n = sc.nextInt();
        for ( int i = 1; i <=n ; i++ ){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
