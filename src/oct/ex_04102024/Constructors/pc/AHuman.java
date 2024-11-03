package oct.ex_04102024.Constructors.pc;

public class AHuman {
    String planet = "AHuman";
    String eye_color;
    String name;
    long aadhaar_id;

    //Default Constructor
    AHuman(){
        System.out.println("I will be called, when object is created");
        //Write a code here which will automatically called when object is created.
        //I can write a code - Read a txt file
        //I can write a code - Read a CSV, Excel file here
    }

    //Parameterized Constructor
    AHuman(String name){
        System.out.println("Hi, I am Parameterized Constructors");
        this.name = name;
    }

    void walk(){
        System.out.println("NRNA");
    }

    int talk(){
        System.out.println("WRNA");
        return 10; //If he talk then he will be paid 10 rs.
    }

    String sleep (String name){
        System.out.println("WRWA");
        System.out.println("Sleeping");
        return "I am Sleeping";
    }

    void eat(String name){
        System.out.println("NRWA");
        System.out.println("Eat");
    }
}
