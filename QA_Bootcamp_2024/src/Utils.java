public class Utils {

    public static void printSquare(Square sq){
        System.out.println("Square with side " + sq.getLength() + " has area of "+ sq.getArea());
    }

    public static void printBook(Book pr) {
        System.out.println("Book " + pr.getBookName() + " (" + pr.getPrice() + " RON)," + " by " +
                pr.getAuthor().getAuthorName() + ", published in " + pr.getYear());
    }
}
