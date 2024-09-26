package sept.ex_13092024;

public class Lab023 {

    public static void main(String[] args) {
        //Char literals

        // Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Priya"+ new_line + "Ayyanar");
        System.out.println("Priya"+ tab_line + "Ayyanar");
        System.out.println("Priya"+ back_space + "Ayyanar");
        System.out.println("Priya"+ carriage_return + "Ayyanar");

        char c4 = '\u0041';
        System.out.println(c4);
    }
}
