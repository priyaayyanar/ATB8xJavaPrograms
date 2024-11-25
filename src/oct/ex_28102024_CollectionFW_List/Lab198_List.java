package oct.ex_28102024_CollectionFW_List;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab198_List {
    public static void main(String[] args) {
        //List list = new List();
        List list = List.of("banana","apple","grapes","orange");
        System.out.println(list);
        System.out.println(list.size());
        //list.add("guava"); -> UnsupportedOperationException
    }
}
