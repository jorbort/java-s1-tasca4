package task4lvl1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class DummyTest {
	Dummy dummy;

	@BeforeEach
	public void setUp() {
		dummy = new Dummy();
	}

	@Test
	public void testOutOfBounds(){
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            dummy.getWord(5);
        });
	}
}
