package sept.ex_23092024;

public class Lab087 {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooo");
            case 'A':
                System.out.println(65);
                break;
            case 'B':
                System.out.println(66);
                break;
//                Output:
//                Hellooo
//                65
            // As there is no break in default case, it also executed the case A and got break there.
        }

    }
}
