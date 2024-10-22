package sept.ex_23092024;

public class Lab089 {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c+'B');
        switch (c){
            case 'A':
                System.out.println(c);
                break;
            case 'B':
                System.out.println('B');
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
