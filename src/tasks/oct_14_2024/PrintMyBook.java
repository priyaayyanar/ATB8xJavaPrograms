package tasks.oct_14_2024;

public class PrintMyBook extends Book{

    public PrintMyBook(String harryPotter, String s, String number) {
        super();
    }

    @Override
    void getDetails(String name, String author, int price) {
        name = "Harry Potter";
        author = "J.k. Rowling";
        price = 100;
        System.out.print("Book Name : " + name + ",");
        System.out.print("Author : " + author + ",");
        System.out.print("Price : " + price);
    }
}
