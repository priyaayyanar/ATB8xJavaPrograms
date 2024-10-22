package tasks.sept_23_2024;

public class Task1 {
    public static void main(String[] args) {
        //Create a simple calculator that performs addition, subtraction, multiplication, and division,
        // modus based on user input using switch statements.
        //
        //Inputs :   num 1, num 2, +
        //Output :  num1+num2 → print information.

        int num1 = 18;
        int num2 = 13;
        String math_operation = "*";
        switch (math_operation){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid Math Operation");
                break;
        }
    }
}
