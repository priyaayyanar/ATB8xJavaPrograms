package sept.ex_25092024;

public class Lab109 {
    public static void main(String[] args) {
        // pre-increment and post-increment of a variable in for loop gives the same result.

        System.out.println("--PostIncrement");
        for (int i=0 ; i < 10 ; i++){
            System.out.println(i);
        }
        System.out.println("--PreIncrement--");
        for (int i=0 ; i < 10 ; ++i){
            System.out.println(i);
        }
        System.out.println("--Alphabets--");
        for (char a = 'A' ; a <= 'Z' ; a++){
            if(a == 'P'){
                break;
            }
            System.out.println(a);
        }
        System.out.println("--break--");
        for (char a = 'A' ; a <= 'Z' ; a++){
            if(a == 'P'){
                System.out.println("--continue--");
                continue;
            }
            System.out.println(a);
        }
    }
}
