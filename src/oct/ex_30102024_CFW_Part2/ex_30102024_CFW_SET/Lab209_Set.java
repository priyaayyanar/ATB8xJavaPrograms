package oct.ex_30102024_CFW_Part2.ex_30102024_CFW_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab209_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Priya");
        hs.add("priya");
        hs.add("Pranu");
        hs.add("Prema");
        System.out.println(hs);
    }
}
