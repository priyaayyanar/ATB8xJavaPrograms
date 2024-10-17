package sept.ex_18092024;

public class Lab049_Example2 {

    public static void main(String[] args) {
        //GST -> 18.45
        int course_fee = 100;
        float GST = 18.45F;

        // int total_price = course_fee+GST; -> Narrowing -> implicit - Invalid
        float total_price1 = course_fee+GST; //widening -> implicit - valid
        System.out.println(total_price1);

        int total_price2 = course_fee+(int) GST; // Narrowing -> explicit - valid
        System.out.println(total_price2);






    }
}
