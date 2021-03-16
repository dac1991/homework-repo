import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;


    public Borrower() {
        this.books = new ArrayList<Book>();
    }

    public int getSizeOfBookCollection() {
        return this.books.size();
    }

    public void borrowBook(Book book) {
        this.books.add(book);
    }

}
