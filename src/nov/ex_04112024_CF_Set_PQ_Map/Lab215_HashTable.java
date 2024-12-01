package nov.ex_04112024_CF_Set_PQ_Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab215_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable();
        ht1.put(1,"Apple");
        ht1.put(2,"Apple");
        ht1.put(3,"Mango");
        ht1.put(4,"Orange");
        ht1.put(4,"Kiwi");
        //  ht1.put(5,null); -> NullPointerException
        System.out.println(ht1);

        HashMap<Integer, String> ht2 = new HashMap();
        ht2.put(1,"Apple");
        ht2.put(2,"Apple");
        ht2.put(3,"Mango");
        ht2.put(4,"Orange");
        ht2.put(4,"Kiwi");
        ht2.put(5,null);
        System.out.println(ht2);

        //For Iteration process
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
            System.out.println(ht1.get(e.nextElement()));
        }
    }
}
