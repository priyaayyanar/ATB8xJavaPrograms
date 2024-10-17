package tasks.sept_18_2024;

public class Task1_Lab059 {
    public static void main(String[] args) {
        //Example of Widening
        byte b = 25;

        //Implicit casting
        int i = b; //JVM will tack care of type casting
        // No loss of data since we always use a big bucket to cast a type
        // Valid

        //Explicit casting
        int j = (int) b; // Developer has to cast the type
        // If not, no problem, JVM will take care of casting
        //Valid

        System.out.println(i);
        System.out.println(j);

        //Example of Narrowing
        float egg_price = 5.36F;

        //Implicit casting
        //int total_dozen_egg_cost = 12 * egg_price; -> Float size is greater than int.
        // We couldn't put a bigger bucket into a smaller one. JVM will not allow Implicit Narrowing.
        //Invalid

        //Explicit casting
        int total_dozen_egg_cost = 12 * (int) egg_price;
        //If we want to ignore the decimal point value then we can go for Explicit casting.
        //We can get a round resultant value without point.
        //Valid - But data loss would be there.

        System.out.println(total_dozen_egg_cost);

    }
}
