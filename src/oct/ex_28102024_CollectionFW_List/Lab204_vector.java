package oct.ex_28102024_CollectionFW_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_vector {
    public static void main(String[] args) {
        List myList1 = new ArrayList(5);
        myList1.add("Priya");
        myList1.add("Akshaya");
        myList1.add("Aaradhya");
        myList1.add("Sanjana");
        myList1.add("Sanjana");
        myList1.add("Sanjana");
        System.out.println(myList1);

        Vector v = new Vector();
        v.add("Priya");
        v.add("Akshaya");
        v.add("Sanjana");
        v.add("Sanjana");
        v.add("Sanjana");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Sanjana"));
        System.out.println(v.lastIndexOf("Sanjana"));
        System.out.println(v.contains("Sanjana"));
        //System.out.println(v.replaceAll(););
    }
}
