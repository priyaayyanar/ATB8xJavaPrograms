package oct.ex_23102024_Exception;

public class Lab183_CustomException {

    //Own Exception
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank hdfc = new Bank("INR",123);
        Bank jp_chase = new Bank("USD",200);
        System.out.println(sbi.add(sbi));
        System.out.println(sbi.add(hdfc)); // 100 + 123
        System.out.println(sbi.add(jp_chase));




    }
}
