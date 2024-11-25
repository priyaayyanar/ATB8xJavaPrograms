package oct.ex_30102024_CFW_Part2;

import java.util.ArrayList;
import java.util.List;

public class Lab208_List {
    public static void main(String[] args) {
        Student s1 = new Student("Priya",1);
        Student s2 = new Student("Ayyanar",2);
        Student s3 = new Student("Pranu",3);
        List<Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);
        System.out.println(myStudent);
        System.out.println(s1.printDetails());
        System.out.println(s2.printDetails());
        System.out.println(s3.printDetails());
    }
}

class Student{
    String name;
    Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
    // Or
    public String printDetails() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
