package tasks.oct_04_2024;

public class Person_BluePrint {
    //Create a Person Class with 10 A, 5 Behavr( All types of Methods)
    // and use the DC and PC to set the values, Create 5 Objects.
    String name, gender, dob, address, language, occupation;
    int rollNo, age, salary;
    long phNo;

    Person_BluePrint() {
        System.out.println("Hi, I'm inside DC");
    }

    Person_BluePrint(int rollNo, String name, String gender, String dob, int age, long phNo, String occupation, int salary) {
        System.out.println("Hi, I'm inside PC");
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
        this.phNo = phNo;
        this.occupation = occupation;
        this.salary = salary;
    }

    void walk() { //NRNA
        System.out.println("This Person can walk.");
    }

    void talk(String language) { //NRWA
        System.out.println("This person speaks : " + language );
    }

    public String sleep() { // WRNA
        return "This Person Sleeps Well";
    }

    public String place(String address) {//WRWA
        return address;
    }
}
