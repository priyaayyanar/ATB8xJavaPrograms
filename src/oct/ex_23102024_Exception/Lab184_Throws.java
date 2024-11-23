package oct.ex_23102024_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab184_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("name.txt");
    }
}
