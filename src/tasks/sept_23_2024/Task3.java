package tasks.sept_23_2024;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that converts between different units
        // (e.g., kilometers to miles, Celsius to Fahrenheit)
        // based on user selection using a switch statement.
        //Input. -
        //choice - 1 - km → m, km → 1km
        //choice - 2 - f → c, f → c
//        double kilometer = 5;
//        double fahrenheit = 100;
        System.out.println("Enter Input : 1 - Kilometer to Miles | 2 - Celsius to Fahrenheit");
        int i = 2;
        switch (i){
            case 1:
                double miles = 1 / 1.6;
                System.out.println("Choice 1 : 1 Kilometer is equal to "+ miles + " Miles.");
                break;
            case 2:
                double fahrenheit = 100;
                System.out.println("100 Fahrenheit is equal to "+ ((fahrenheit - 32)*5/9) + "Celsius");
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}
