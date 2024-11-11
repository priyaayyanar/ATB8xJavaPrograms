package tasks.oct_14_2024;

public class PrintMyBook extends Book{
    public PrintMyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name+ ","+author+","+price);
//        System.out.println(author);
//        System.out.println(price);
    }
}
