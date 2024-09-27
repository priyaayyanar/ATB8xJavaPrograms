package sept.ex_16092024;

public class Lab033_InterviewQnA {
    public static void main(String[] args) {
        String s1 = "Priya";
        String s2 = "Ayyanar";
        //String Concatination operator
        System.out.println(s1+s2);
        int a = 10;
        int b = 10;
        System.out.println(s1+s2+a+b); //PriyaAyyanar1010 -> if String first then the arithmetic operation will not happen for int types. It will just print the value of the variable
        System.out.println(a+b+s1+s2);//20PriyaAyyanar -> If numbers are first then it will perform the arithmetic operation and will concatenate the String
    }
}
