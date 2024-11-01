package tasks.sept_30_2024;

import java.util.Scanner;

public class Task2_Count_Vowels_Consonants {
    public static void main(String[] args) {
        String s = "Priya";
        int vowels = 0, consonant = 0;
        s = s.toLowerCase();

        for (int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ++vowels;
            }
            else if (ch >= 'a' && ch <= 'z'){
                ++consonant;
            }
            else {
                System.out.println("Please Enter a valid String.");
            }
        }
        System.out.println("Count of Vowels in the String : "+vowels);
        System.out.println("Count of Consonants in the String : "+consonant);


    }
}
