package LVL1.ex03;

import org.junit.Before;
import org.junit.Test;

public class DummyTest {
	Dummy dummy;

	@Before
	public void setUp() {
		dummy = new Dummy();
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testOutOfBounds(){
		dummy.getWord(5);
	}
}
