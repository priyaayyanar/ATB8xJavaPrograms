package nov.ex_04112024_Generics;

public class Lab216_Generics {
    public static void main(String[] args) {
        temp(1);
        //temp("Hi"); - > String in not accepted
        //temp(true); -> boolean is not accepted

        temp_generic(1);
        temp_generic("Hi"); //- > String in accepted
        temp_generic(true); // -> boolean is not accepted

        Math.max(1,2); //int
        Math.max(1.5,5.5); // double
        Math.max(1.455f, 5.789f);// float
        Math.max(34534546l,34523466456l);//long
        //Math.max("Hello","Hi");
    }

    public static void temp(Integer i){
        System.out.println(i);
    }

    public static <T> void temp_generic(T ig){
        System.out.println(ig);
    }


}
