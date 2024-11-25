package oct.ex_28102024_CollectionFW_List;

import java.util.ArrayList;
import java.util.List;

public class Lab200_List_ArayList_ForLoop {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Milk");
        list.add("Butter");
        list.add("Bread");
        list.add("Cheese");
        list.add("Panneer");
        list.add("Jam");

        System.out.println("--------Default ForLoop-----------");
        for (int i =0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("--------Default ForEachLoop-----------");
//        for(data_type variable : array | collection){
//              body of for-each loop
//        }
        for (Object o : list){
            System.out.println(o);
        }
    }
}
