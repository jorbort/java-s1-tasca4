import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testListNotNull() {
        assertNotNull(library.getAllbooks());
    }

    @Test
    public void testAddBook() {
        library.addBook("Harry Potter");
        assertEquals(1, library.getSize());
    }

    @Test
    public void testDeleteBook() {
        library.addBook("harry potter");
        library.deleteBook("harry potter");
        assertEquals(0, library.getSize());
    }
}
