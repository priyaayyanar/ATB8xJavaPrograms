package tasks.sept_27_2024;

public class Task2 {
    public static void main(String[] args) {
        //Create a Java program that prints the first 5 even numbers using a do-while loop.

        /*I/O
        I => count n= 5, i => iteration,
        O => i
        */

        /*Rough Logic
        i = 1; n == 5 ; i++
        only i%2 == 0
        print i
         */

        //Real Logic
        int count = 1 ;
        int i = 1;
        do{
            if(i%2 == 0){
                System.out.println(i);
                count++;
            }
            i++;

        }while (count <= 5);
    }
}
