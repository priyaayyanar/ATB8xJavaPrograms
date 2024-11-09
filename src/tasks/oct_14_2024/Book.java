package tasks.oct_14_2024;

abstract class Book {
    protected String name;
    protected String author;
    protected int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}

