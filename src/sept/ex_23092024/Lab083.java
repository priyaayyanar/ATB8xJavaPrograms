package sept.ex_23092024;

public class Lab083 {
    public static void main(String[] args) {
        // JDK >13
        //Introduced one new concept called multiple matches are used and accepted
        int itemCode = 006;
        switch (itemCode)
        {
            case 001,002,003:
                System.out.println("All of them are Electronic Gadgets");
                break;
            case 004,005,006:
                System.out.println("All of them are Electrial Gadgets");
                break;
            default:
                System.out.println("None");
                break;
        }

    }
}
