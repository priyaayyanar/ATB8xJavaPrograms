package oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab188_Arrays_1D {
    public static void main(String[] args) {
        int[] marks = {71,72,78,88,98};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[4]);
        //System.out.println(marks[5]); -> ArrayIndexBoundsException

        int[] marks_1 = new int[5];
        marks_1[0] = 10;
        marks_1[1] = 20;
        marks_1[2] = 30;
        marks_1[3] = 40;
        marks_1[4] = 50;
        System.out.println(marks_1[0]);
        System.out.println(marks_1[2]);
        System.out.println(marks_1[4]);
        // System.out.println(marks_1[5]); -> ArrayIndexBoundsException

    }
}