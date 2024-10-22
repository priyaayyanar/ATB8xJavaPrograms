package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        //Use of "->" can avoid using "break" keyword and it is applicable only for one line statement
        // ie, multiple statements are not allowed.
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("It's a laptop");
            case 002 -> System.out.println("It's a Desktop");
            case 003,004 -> System.out.println("It's a mobile phone");
            default -> System.out.println("Hi");
        }
    }
}
