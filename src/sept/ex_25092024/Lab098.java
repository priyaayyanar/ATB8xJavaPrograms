package sept.ex_25092024;

public class Lab098 {
    public static void main(String[] args) {
        // avoid using float and byte types to avoid confusions in increment part.
        //try to use only int to avoid confusions
        //only numerical type.
        for (float f = 0.0f; f < 10.67 ; f++){
            System.out.println("Hi Float : "+ f); //valid. but confusing in increment part.
        }

        for (byte b = 1; b < 10.5 ; b++){
            System.out.println("Hi Byte : "+ b); //valid. but confusing in increment part.
        }
    }
}
