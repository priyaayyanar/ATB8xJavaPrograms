package oct.ex_28102024_CollectionFW_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab201_List_ArrayList_Sort {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(78);
        marks.add(84);
        marks.add(72);
        marks.add(98);
        marks.add(71);

        System.out.println(marks);
        System.out.println("Sorted M");
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
