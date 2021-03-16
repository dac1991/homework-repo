import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("American Gods", "Neil Gaiman", "Fantasy");
        library = new Library(50);
    }

    @Test
    public void checkBorrowerHasNoBooks(){
        assertEquals(0, borrower.getSizeOfBookCollection());
    }

    @Test
    public void addBookToBorrowersBookshelf(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);

        borrower.borrowBook(book);
        library.removeBookFromLibrary(book);
        assertEquals(1, borrower.getSizeOfBookCollection());
        assertEquals(3, library.countBooks());
    }
}


