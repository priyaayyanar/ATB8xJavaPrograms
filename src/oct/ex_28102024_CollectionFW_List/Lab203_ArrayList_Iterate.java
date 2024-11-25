package oct.ex_28102024_CollectionFW_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Priya");
        myList.add("Akshaya");
        myList.add("Aparna");

        System.out.println(" ---- To Print ArrayList 1 ----");
        for (String str : myList){
            System.out.println(str);
        }

        System.out.println(" ---- To Print ArrayList 2 ----");
        for(int i =0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        System.out.println(" ---- To Print ArrayList 3 ----");
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
