package tasks.oct_14_2024.usingInterface;

public class Book {
    public static void main(String[] args) {
        BookI myBook = new PrintMyBook();
        myBook.getDetails("Harry Potter", "J.k. Rowling", 120);
    }
}

interface BookI {
    void getDetails(String name, String author, int price);
}

class PrintMyBook implements BookI {
    @Override
    public void getDetails(String name, String author, int price) {
        name = "Harry Potter";
        author = "J.k. Rowling";
        price = 100;
        System.out.print("Book Name : " + name + ",");
        System.out.print("Author : " + author + ",");
        System.out.print("Price : " + price);
    }
}