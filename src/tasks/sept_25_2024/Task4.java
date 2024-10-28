package tasks.sept_25_2024;

public class Task4 {
    public static void main(String[] args) {
        //Count vowels and consonants in a String. (priya) - v = 2 , c =. 4
        String line = "APriya";
        int vowels = 0, consonants = 0;

        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);

            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }

            // check if character is in between a to z
            else if (ch >= 'a' && ch <= 'z') {
                ++consonants;
            }
            else {
                System.out.println("Please Enter a Valid String.");
            }
        }
        System.out.println("Number of Vowels : "+ vowels);
        System.out.println("Number of Consonants : "+ consonants);
    }
}
