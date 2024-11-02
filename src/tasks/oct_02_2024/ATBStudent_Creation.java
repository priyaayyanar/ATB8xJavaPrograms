package tasks.oct_02_2024;

public class ATBStudent_Creation {

    public static void main(String[] args) {
        // Object 1:
        ATBStudent_Blueprint student1 = new ATBStudent_Blueprint();
        student1.name = "Priya";
        student1.age = 35;
        student1.address = "189/D-Railway Colony";
        student1.batch = "ATB8x_AutomationTesting";
        student1.student_details(student1.name, student1.age, student1.address, student1.batch);
        student1.learn();

        // Object 2:
        ATBStudent_Blueprint student2 = new ATBStudent_Blueprint();
        student2.name = "Pranu";
        student2.age = 15;
        student2.address = "C1-Maruthi Residency";
        student2.batch = "ATB9x_AutomationTesting";
        student2.student_details(student2.name, student2.age, student2.address, student2.batch);
        student2.write_exam();

        // Object 3:
        ATBStudent_Blueprint student3 = new ATBStudent_Blueprint();
        student3.name = "Shan";
        student3.age = 40;
        student3.address = "17-Mahathmapuram";
        student3.batch = "ATB9x_AutomationTesting";
        student3.student_details(student3.name, student3.age, student3.address, student3.batch);
        student3.interview();

        // Object 4:
        ATBStudent_Blueprint student4 = new ATBStudent_Blueprint();
        student4.name = "Ashmi";
        student4.age = 20;
        student4.address = "7/a-Joyfozen";
        student4.batch = "ATB9x_AutomationTesting";
        student4.student_details(student4.name, student4.age, student4.address, student4.batch);
        student4.learn();

        // Object 5:
        ATBStudent_Blueprint student5 = new ATBStudent_Blueprint();
        student5.name = "Aswin";
        student5.age = 25;
        student5.address = "A14-ShanthiSadhan";
        student5.batch = "ATB9x_AutomationTesting";
        student1.student_details(student5.name, student5.age, student5.address, student5.batch);
        student5.interview();
    }
}
