import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;


    @Before
    public void before(){
        book = new Book("American Gods", "Neil Gaiman", "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("American Gods", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Neil Gaiman", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}