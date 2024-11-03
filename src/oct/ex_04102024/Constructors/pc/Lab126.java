package oct.ex_04102024.Constructors.pc;

public class Lab126 {
    public static void main(String[] args) {
        Dog germanShepherd = new Dog("GermanShepherd");
        System.out.println("Object 1: Dog ");
        System.out.println("Breed - "+germanShepherd.breed);

        Dog bullDog = new Dog("BullDog","Raju",5,4);
        System.out.println("Object 2: Dog");
        System.out.println("Name : "+ bullDog.name);
        System.out.println("Breed : "+ bullDog.breed);
        System.out.println("Age : "+ bullDog.age);
        System.out.println("Legs : "+ bullDog.legs);

    }
}
