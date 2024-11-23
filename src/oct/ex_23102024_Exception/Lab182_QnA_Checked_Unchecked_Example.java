package oct.ex_23102024_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab182_QnA_Checked_Unchecked_Example {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally - Unchecked Exception");
        }

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
            //Trying to read a file which is not exists.
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally - Checked Exception");
        }
    }
}
