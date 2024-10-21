package tasks.sept_20_2024;

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

        int a = 25;
        int b = 35;
        int c = 45;
        if ( a==b && a==c ) {
            System.out.println("Equilateral Triangle");
        }
        else if (a==b && a!=c) {
            System.out.println("Isosceles Triangle");
        }
        else if (a!=b && b==c)
        {
            System.out.println("Isosceles Triangle");
        }
        else if (a!=b && a==c)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}
