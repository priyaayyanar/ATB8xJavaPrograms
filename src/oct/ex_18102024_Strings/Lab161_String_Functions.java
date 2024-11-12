package oct.ex_18102024_Strings;

public class Lab161_String_Functions {
    public static void main(String[] args) {
        String str = " Hello World ";
        // Length
        System.out.println("String Length : "+ str.length());
        //Substring
        System.out.println("Substring : "+str.substring(1,5)); //Hell
        System.out.println("Substring : "+str.substring(0,2)); // H
        //Trim
        System.out.println("Trimmed : " +str.trim()); //works with Unicode character

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase()); // Outputs: " HELLO WORLD "
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println(str.charAt(2));

        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("l"));
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));

        String name = "Priya";
        String name2 = "PriyA";
        System.out.println(name.compareTo(name2));//32
        // ASCII Code of A = 65, a=97 => (97-65 = 32)

        String name3 = " Priya Ayyanar ";
        System.out.println(name3.strip());//Priya Ayyanar->Same as Trimmed
        //Will not work with the Unicode Character.
    }
}
