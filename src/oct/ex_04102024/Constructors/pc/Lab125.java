package oct.ex_04102024.Constructors.pc;

public class Lab125 {
    public static void main(String[] args) {
        AHuman priya = new AHuman(); // Created Object with ref (priya)
        AHuman pranu = new AHuman("Pranu"); // Created Object with ref (pranu)
        AHuman shan = new AHuman("Shan");
        new AHuman(); // Created Object without ref.


        System.out.println(priya.planet);
        System.out.println(pranu.planet);

        // => priya.name = "Priya"; // Setting the value for variable name after the creation of object priya
        // => pranu.name = "Pranu"; // Setting the value for variable name after the creation of object priya
        /* instead of setting the value for a variable after the object creation like this ,
            we can make use of "this" keyword to set the value using parameterized constructor
            during the object creation.
         */


        System.out.println(priya.name);
        System.out.println(pranu.name);
        System.out.println(shan.name);
    }
}
