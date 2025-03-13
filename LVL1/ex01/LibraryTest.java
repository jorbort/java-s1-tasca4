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
	public void testLibrarySize() {
		library.addBook("harry potter");
		library.addBook("lord of the rings");
		library.addBook("The hobbit");
		assertEquals("Size not working as inteded",3, library.getSize());
	}

	@Test
	public void testGetBook(){
		library.addBook("The Bible");
		library.addBook("The Uberable lightness of being");
		library.addBook("Clean Code");
		library.addBookToIndex("Harry Potter", 1);
		assertEquals("Indexing not working properly","The Uberable lightness of being", library.getBook(2));
	}

    @Test
    public void testAddBook() {
        library.addBook("Harry Potter");
        assertEquals("Book was not added to the library" ,1, library.getSize());
    }

    @Test
    public void testDeleteBook() {
        library.addBook("harry potter");
        library.deleteBook("harry potter");
        assertEquals("Incorrect size ",0, library.getSize());
    }

	@Test
	public void testnoDuplicates(){
		library.addBook("Harry Potter");
		library.addBook("Harry Potter");
		assertEquals("Duplicates Found",1, library.getSize());
	}

}
