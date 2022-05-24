package test;

import main.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestBook {
    Book book = new Book("Cat's Cradle", 304,1963);

    @Test
    public void testGetBookTitle() {
        assertEquals("Cat's Cradle", book.getbookTitle());

    }

    @Test

    public void testGetNumOfPages() {
        assertEquals(304 + " pages", book.getnumofPages());

    }

}
