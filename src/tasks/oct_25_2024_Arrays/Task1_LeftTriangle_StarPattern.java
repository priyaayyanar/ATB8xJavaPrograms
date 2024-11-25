package tasks.oct_25_2024_Arrays;

import java.util.Scanner;

public class Task1_LeftTriangle_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
