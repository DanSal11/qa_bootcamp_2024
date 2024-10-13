public class Library {

    public static void main(String[] args) {

        Author firstAuthor = new Author("Cezar Petrescu", "ceazr.petrescu@yahoo.com");
        Book firstBook = new Book("Fram ursul polar", 2004, firstAuthor, 6.55);

        Author secondAuthor = new Author("Lyman Frank Baum", "lyman.frank@yahoo.com");
        Book secondBook = new Book("Vrajitorul din Oz", 2008, secondAuthor, 9.55);

        Utils.printBook(firstBook);
        Utils.printBook(secondBook);

    }

}
