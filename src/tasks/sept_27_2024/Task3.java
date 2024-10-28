package tasks.sept_27_2024;

public class Task3 {
    public static void main(String[] args) {
        //Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

        /* I/O
        I -> iteration i,sum
        O -> sum
         */

        /*Rough Logic
         i = 0; i <= 100; i++
         sum = i + i;
         */

        /*Real Logic */
        int i, sum;
        i = 0;
        sum = 0;
        while (i<=100){
            sum = sum + i;
            i++;
        }
        System.out.println("The Sum of number from 1 to 100 : "+sum);
    }
}
