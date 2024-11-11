package oct.ex_16102024_StaticKeyword;

public class Lab153 {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(33);
        System.out.println(Student.school_name);
        System.out.println(s1.age);
        System.out.println(s2.age);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);
    }
}

class Student{

    int age;
    static String school_name = "ABC";
    {
        System.out.println("IIB");
        System.out.println("Here we can add what we want to do when the object is created");
        System.out.println("Read MySQL DB");
    }
    static {
        System.out.println("SIB");
        System.out.println("Loaded Once, when class is loaded");
    }

    public Student(int age) {
        this.age = age;
    }
}
