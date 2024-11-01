package sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
        functionType1();
        String name = functionType2();
        System.out.println(name);
        functionType3(36,"Priya","Mrs");
        int result = functionType4(2,3);
        System.out.println(result);
    }

    //Type - 1
    //With Return type, without argument
    static void functionType1(){
        System.out.println("Hi - Type1");
    }

    //Type - 2
    //With Return type, without argument
    static String functionType2(){
        System.out.println("Hi - Type2");
        return "String Return Priya";
    }

    //Type - 3
    //Without Return type, with argument
    public static void functionType3(int age,String name,String title){
        System.out.println("Hi - Type3");
        System.out.println("You have shared Title, Name & Age : "+title+"."+name+"-"+age);
    }

    //Type - 4
    //With Return type, with argument
    public static int functionType4(int a, int b){
        System.out.println("Hi - Type4");
        return a+b;
    }
}
