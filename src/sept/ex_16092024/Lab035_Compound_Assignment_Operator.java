package sept.ex_16092024;

public class Lab035_Compound_Assignment_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        float d = 10;
        //Compound Assignment Operator -> +=, -=, *=, /=
        a += 20; // same as a = a+20
        System.out.println("Compound Addition "+a);
        b -= 20; // same as b = b-20
        System.out.println("Compound Subtraction "+b);
        c *= 20; // same as c = c*20
        System.out.println("Compound Multiplication "+c);
        d /= 20; // same as d = d/20
        System.out.println("Compound Division "+d);
    }
}
