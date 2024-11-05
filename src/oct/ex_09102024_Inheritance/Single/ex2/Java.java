package oct.ex_09102024_Inheritance.Single.ex2;

public class Java extends Programming{
    // Java ---"is a"---- programming language -> Is a relationship ->single Inheritance
    public Java(){
        System.out.println("DC");
    }
    public void print(){
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Version : " +version);
    }
}
