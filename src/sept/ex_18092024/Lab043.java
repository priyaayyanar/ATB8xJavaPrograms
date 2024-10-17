package sept.ex_18092024;

public class Lab043 {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 10;
        // byte c = a+b; -> Incompatible Type
        int c = a+b;
        System.out.println(c);

        char c1 = 'A'; //ASCII Value - 65
        System.out.println(c1); // -> it will print, just A
        char c2 = 'B'; //ASCII Value - 66
        int c3 = c1+c2; //while performing concatenation it will take ASCII value. 65 + 66 = 131
        System.out.println(c3);
    }
}
