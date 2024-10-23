package tasks.sept_25_2024;

public class Task3 {
    public static void main(String[] args) {
        //Prime Number from 1 to 100. (for loop)
        // Prime Number - a number that can be divided exactly only by itself and 1, for example 7, 17 and 41.
        System.out.println("Prime Numbers from 1 to 100 are as follows:");
        for (int i = 1; i <= 100; i++){
            if(i%1 == 0 && i%i == 0 && i%2 != 0 && i%3 != 0 && i%5 != 0){
                System.out.println(i);
            }
        }
    }
}
