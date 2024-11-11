package oct.ex_16102024_StaticKeyword.ENUM;

public class Lab157_EnumEx {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexCode());
        System.out.println(Color.GREEN.getHexCode());
        System.out.println(Color.BLUE.getHexCode());

        if (Color.GREEN.getHexCode() == "#00FF00"){
            System.out.println("Color is Green");
        }
    }

}
enum Color{
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String hexCode;

    private Color(String hexCode){
                this.hexCode = hexCode;
    }

    public String getHexCode() {
        return this.hexCode;
    }
}
