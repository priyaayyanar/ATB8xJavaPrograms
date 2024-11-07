package oct.ex_11102024_Encapsulation.SuperKeyword;

public class Lab139 {

    public static void main(String[] args) {
        Car c = new Car();
    }

}
class Car extends Vehicle{
    private int maxSpeed = 280;

    Car(){
        super(10);
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
    }
}

class Vehicle{
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vehicle");
    }
    void message(){
        System.out.println("NA - Hello Vehicle");
    }
    void message(int a){
        System.out.println("WA - Hello Vehicle");
    }
}
