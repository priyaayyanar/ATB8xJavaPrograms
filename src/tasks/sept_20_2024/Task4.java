package tasks.sept_20_2024;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        //Logic Building

        /*
        Step 1: I/O
        Input :int -> from user. Scanner class
        output : String -> FizzBuzz, Fizz, Buzz - SOP

        Step 2:Rough Logic
            for int i = 1; i <= 100 (input)
            i multiples of 3 & 5 -> FizzBuzz
            i multiples of 3 -> Fizz
            i multiples of 5 -> Buzz
            nothing matches then print i

        Step 3: Real Logic

        */
        System.out.println("Enter the Number Limit : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                  System.out.println("FizzBuzz");
                } else if (i % 3 == 0){
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
            else {
                System.out.println(i);
            }
        }
    }
}
