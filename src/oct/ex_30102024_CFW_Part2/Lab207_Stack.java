package oct.ex_30102024_CFW_Part2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Priya");
        s.add("Ayyanar");
        s.add("Pranu");
        s.push("Akshaya");
        s.push("Sanjana");
        System.out.println(s);
        System.out.println(s.pop()); // remove the last element from the stack itself
        System.out.println(s);
        System.out.println(s.peek()); // just show the last element in the stack
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Priya2"));
        System.out.println("---------");
        System.out.println(s);
        s.add(0,"Praneesh");
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
    }
}
