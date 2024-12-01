package nov.ex_04112024_CF_Set_PQ_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab214_List_Contains_HashMap_Important {
    public static void main(String[] args) {
        HashMap<String,String> student1 = new HashMap();
        student1.put("name","Priya");
        student1.put("rollNo","1");
        student1.put("phNo","986757644");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap();
        student2.put("name","Praneesh");
        student2.put("rollNo","2");
        student2.put("phNo","674459798");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

    }
}
