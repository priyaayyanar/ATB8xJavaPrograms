package sept.ex_25092024;

import java.util.Scanner;

public class Lab114_UserInPut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Given Input is : "+ num);

        System.out.print("Enter the Name : ");
        String name = sc.next();
        System.out.println("Given name is : "+ name);
    }
}
