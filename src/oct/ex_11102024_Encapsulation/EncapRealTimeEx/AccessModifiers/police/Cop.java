package oct.ex_11102024_Encapsulation.EncapRealTimeEx.AccessModifiers.police;

public class Cop {
    public int gun;
    public String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }
    public void canIShoot(){
        System.out.println("Yes, You can!");
    }
}
