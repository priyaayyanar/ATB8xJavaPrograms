package oct.ex_30102024_CFW_Part2.ex_30102024_CFW_SET;

import java.util.*;

public class Lab210_Diff_HSet_LHSet_TSet {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add("Kiwi");
        hs.add(null);
        System.out.println(hs); //[null, Apple, Watermelon, Orange]

        Set lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Kiwi");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.size());

        Set ts = new TreeSet();
        ts.add("Apple");
        ts.add("Apple");
        ts.add("DApple");
        ts.add("Watermelon");
        ts.add("Orange");
        ts.add("Kiwi");
        // ts.add(null); -> NullPointerException : null not allowed
        System.out.println(ts);
        System.out.println(ts.size());

        System.out.println("--ForLoop--");
        for (Object o : ts){
            System.out.println(o);
        }
        System.out.println("--Iterator--");
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
