package tasks.oct_02_2024;

import java.util.SortedMap;

public class ATBStudent_Blueprint {
            //Create a Class  ATBStudent and 5 Objects - (Attributes/Behaviour) - github.com
        String name;
        int age;
        String batch;
        String address;
        long phNo;
        void student_details(String name, int age, String batch, String address){
                System.out.println("Student Name : "+ name);
                System.out.println("Student Age : "+ age);
                System.out.println("Student Batch : "+ batch);
                System.out.println("Student Address : "+ address);

        }
        void write_exam(){
                System.out.println("Student is writing exams");
                System.out.println("-------------------------------------------");
        }
        void learn(){
                System.out.println("Student is learning Automation");
                System.out.println("-------------------------------------------");
        }
        void interview(){
                System.out.println("Student is attending interviews");
                System.out.println("-------------------------------------------");
        }

}
