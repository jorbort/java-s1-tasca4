package task4lvl1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LibraryTest {

	private Library library;

	@BeforeEach
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
		assertEquals( 3, library.getSize(), "Size not working as inteded");
	}

	@Test
	public void testGetBook() {
		library.addBook("The Bible");
		library.addBook("The Uberable lightness of being");
		library.addBook("Clean Code");
		library.addBookToIndex("Harry Potter", 1);
		assertEquals("The Uberable lightness of being", "The Uberable lightness of being", library.getBook(2));
	}

	@Test
	public void testAddBook() {
		library.addBook("Harry Potter");
		assertEquals( 1, library.getSize(),"Book was not added to the library");
	}

	@Test
	public void testDeleteBook() {
		library.addBook("harry potter");
		library.deleteBook("harry potter");
		assertEquals( 0, library.getSize(), "Incorrect size ");
	}

	@Test
	public void testnoDuplicates() {
		library.addBook("Harry Potter");
		library.addBook("Harry Potter");
		assertEquals( 1, library.getSize(), "Duplicates Found");
	}

}
