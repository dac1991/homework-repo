import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(5);
        book1 = new Book("American Gods", "Neil Gaiman", "Fantasy");
        book2 = new Book("Salem's Lot", "Stephen King", "Horror");
        book3 = new Book("The Blade Itself", "Joe Abercrombie", "Grimdark");
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBookToLibrary(book2);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void checkLibraryCapacity() {
        assertEquals(false, library.checkLibraryIsAtCapacity());
    }

    @Test
    public void borrowBookFromLibrary() {
        library.addBookToLibrary(book3);
        library.removeBookFromLibrary(book1);
        assertEquals(1, library.countBooks());

    }

}