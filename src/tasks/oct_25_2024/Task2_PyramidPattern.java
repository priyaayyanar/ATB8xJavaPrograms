package tasks.oct_25_2024;

import java.util.Scanner;

public class Task2_PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){ // number of rows iteration
            for (int j = n; j > i ; j--){ // number of spaces iteration
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++){ // number of stars iteration
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
