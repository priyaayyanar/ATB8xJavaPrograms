package oct.ex_04102024.Constructors.pc;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    Dog(){
        System.out.println("Hi, I'm DC");
        System.out.println("God is Happy!");
    }

    Dog(String breed){
        System.out.println("Hi, I'm PC");
        this.breed = breed;
    }

    Dog(String breed, String name, int age, int legs){
        System.out.println("Hi, I'm PC");
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }
    void walk(){

    }
}
