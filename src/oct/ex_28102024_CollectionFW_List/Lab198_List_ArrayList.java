package oct.ex_28102024_CollectionFW_List;

import java.util.ArrayList;
import java.util.List;

public class Lab198_List_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("3");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("2")); // Finds the first occ of element in list
        System.out.println(list.lastIndexOf("3")); //Finds the last occ of element in list
    }
}
