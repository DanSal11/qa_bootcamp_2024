public class Book {

    String bookName;
    int year;
    Author author;
    double price;

    public Book(String name, int year, Author author, double price) {
        this.bookName = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
