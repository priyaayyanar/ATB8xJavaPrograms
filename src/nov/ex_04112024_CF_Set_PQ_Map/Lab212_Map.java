package nov.ex_04112024_CF_Set_PQ_Map;

import java.util.*;

public class Lab212_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap(); //UnOrder
        Map m2 = new LinkedHashMap(); //Order
        Map m3 = new TreeMap(); //Sorted Order

        m1.put("name", "Priya");
        m1.put("rollNo",123);
        m1.put("phNo", 98765432);
        System.out.println(m1);

        m2.put("name", "Priya");
        m2.put("rollNo",123);
        m2.put("phNo", 98765432);
        System.out.println(m2);

        m3.put("name", "Priya");
        m3.put("rollNo",123);
        m3.put("phNo", 98765432);
        System.out.println(m3);
    }
}
