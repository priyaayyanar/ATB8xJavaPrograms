package sept.ex_20092024;

public class Lab074 {
    public static void main(String[] args) {
        // Grade Calculator
        int score = 85;
        char grade;
        if (score >= 90 && score <=100){
            grade = 'A';
        }
        else if (score >= 80 && score <= 89) {
            grade = 'B';
        }
        else if (score >= 70 && score <= 79) {
            grade = 'C';
        }
        else if (score >= 60 && score <= 69) {
            grade = 'D';
        }
        else if (score >= 50 && score <= 59) {
            grade = 'E';
        }
        else if (score > 100 && score < 0) {
            grade = 'O';
            System.out.println("LOL! Are You God ?");
        }
        else {
            grade = 'F';
        }
        System.out.println("Your Grade is : " + grade);
    }
}
