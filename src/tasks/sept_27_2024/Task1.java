package tasks.sept_27_2024;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {
        //Give me example of while vs do while loop in Lab ex.

        //While executes the condition first and then executes the body.
        //Whereas in do-while, the body executed first and then it checks for the condition.

        //while loop -> Entry Control Loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for while (give 11) : ");
        int i = sc.nextInt();
        if(i > 0){
            while (i <= 10){
                System.out.println("Iteration = "+i);
                i++;
            }
        }
        else {
            System.out.println("Enter a valid number.");
        }

        //do-while -> Exit control loop
        System.out.println("Enter the value for do-while (give 11) : ");
        int j = sc.nextInt();
        if(j > 0){
            do {
                System.out.println("Iteration = "+j);
                j++;
            }while (j <= 10);
        }
        else {
            System.out.println("Enter a valid number.");
        }
    }
}