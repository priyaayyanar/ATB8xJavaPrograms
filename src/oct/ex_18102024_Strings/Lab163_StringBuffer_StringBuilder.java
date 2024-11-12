package oct.ex_18102024_Strings;

public class Lab163_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuffer strBfr = new StringBuffer("Priya");
        strBfr.append("Ayyanar");
        System.out.println(strBfr); //PriyaAyyanar
        //Hence changed the original value for the same object
    }
}
