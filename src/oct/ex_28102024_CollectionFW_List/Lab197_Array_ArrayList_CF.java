package oct.ex_28102024_CollectionFW_List;

import java.util.ArrayList;

public class Lab197_Array_ArrayList_CF {
    public static void main(String[] args) {
        ArrayList studentList = new ArrayList();
        studentList.add("Priya");
        studentList.add("Ayyanar");
        studentList.add("Ayyanar"); // duplicate is allowed
        studentList.add("Soundeeswari");
        studentList.add("Praneesh");
        studentList.add("Akshaya");
        studentList.add(true); // diff data type is allowed
        studentList.add(123); // diff data type is allowed
        studentList.add(null); // diff data type is allowed

        System.out.println(studentList);

    }
}
