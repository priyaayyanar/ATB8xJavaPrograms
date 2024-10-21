package sept.ex_20092024;

public class Lab071_ex {
    public static void main(String[] args) {
        boolean b = true;
        b = !true;
        if(2+2 < 4){
            System.out.println(" Inside the loop"); //this never execute
        }
        // there is no else
        System.out.println("Outside -> " + b);
    }
}
