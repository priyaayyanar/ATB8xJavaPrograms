package sept.ex_16092024;

public class Lab036_Relational_Operator {
    public static void main(String[] args) {
        //Relational Operator returns some kind of Boolean result (true Or false)
        // > <, >= <=, != , ! -> always return true or false
        int a = 10;
        int b = 30;
        boolean c = a > b ;
        System.out.println(c);

        int priya_age = 36;
        int moni_age = 36;
        boolean age = priya_age > moni_age; //false
        System.out.println(age);
        boolean age1 = priya_age >= moni_age; //true
        System.out.println(age1);
    }
}
