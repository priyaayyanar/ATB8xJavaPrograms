package tasks.sept_20_2024;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Triangle Classifier ( If)

        // Write a program that classifies a triangle based on its side lengths.

        // Given three input values representing the lengths of the sides, determine

        // if the triangle is equilateral (all sides are equal),

        // isosceles (exactly two sides are equal), or

        // scalene (no sides are equal).

        // Use an if-else statement to classify the triangle.

        // side1, side2, side3 ->
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side 1 : " );
        double side1 = sc.nextDouble();

        System.out.print("Enter Side 2 : " );
        double side2 = sc.nextDouble();

        System.out.print("Enter Side 3 : " );
        double side3 = sc.nextDouble();

        if ( side1==side2 && side1==side3 ) {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
    }
}
