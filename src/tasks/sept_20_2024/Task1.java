package tasks.sept_20_2024;

import java.net.Socket;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //By using Ternary Operators max between 3 numbers.
        //
        // Input int - a,b,c - a = 10, b = 20, c = 45
        //
        // Max → a,b,c → c
        int max1, max2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter number 3 : ");
        int c = sc.nextInt();

        max1 = (a > b) ? a : b ;
        max2 = (max1 > c) ? max1 : c ;
        System.out.println("The Maximum number is : "+ max2);
    }
}
