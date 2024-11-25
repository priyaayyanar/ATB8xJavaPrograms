package oct.ex_28102024_CollectionFW_List;

import java.util.ArrayList;
import java.util.List;

public class Lab199_List_ArrayList_String {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Priya");
        list.add("Ayyanar");
        list.add("Pranu");
        list.add("Priya");
        list.add("Akshaya");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.contains("Priya"));
        System.out.println(list.indexOf("Priya")); // Finds the first occ of element in list
        System.out.println(list.lastIndexOf("Priya")); //Finds the last occ of element in list
    }
}
