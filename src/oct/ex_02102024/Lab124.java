package oct.ex_02102024;

import oct.ex_04102024.Person1;
import sept.Person;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {
        Person1 ashwin = new Person1();
        /* a class is a blueprint of objects. By using a class, we can create n number of objects.
        A class contains 2 things.
        1. attributes | data members
        2. behaviours | functionality
         */
        //An object is a real time entity

        Lab_StudentClass priya = new Lab_StudentClass();
        priya.age = 35;

        Lab_StudentClass pranu = new Lab_StudentClass();
        pranu.age = 15;

        Person shan = new Person();

        Person ashmi; // just creating a reference for an instance

        new Person(); // it will create a memory space on heap area.
        new Person(); // if these objects are not been used then the Garbage collector will delete all the
        // orphan memory space on heap area

        System.out.println(priya); //oct.ex_02102024.Lab_StudentClass@5f184fc6
        System.out.println(pranu); // oct.ex_02102024.Lab_StudentClass@3feba861
        //Same class with different objects. with ref priya and pranu respectively.
        //Since both objects are pointing to a different memory space it returns different values.

    }
}