package task4lvl1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DniCalculatorTest {
	
	DniCalculator calculator;

	@BeforeEach
    public void setUp() {
        calculator = new DniCalculator();
    }

	@Test
	public void testGetDniLetter() {
		assertEquals("B","B", calculator.getDniLetter(26950031));
	}

	@Test
	public void testGetDniLetter2() {
		assertEquals("N","N", calculator.getDniLetter(26950032));
	}
	@Test
	public void testGetDniLetter3() {
		assertEquals("J","J", calculator.getDniLetter(26950033));
	}

	@Test 
	public void testGetDniLetter4() {
		assertEquals("Z","Z", calculator.getDniLetter(26950034));
	}

	@Test
	public void testGetDniLetter5() {
		assertEquals("S","S", calculator.getDniLetter(26950035));
	}
	@Test
	public void testGetDniLetter6() {
		assertEquals("Q","Q", calculator.getDniLetter(26950036));
	}
	@Test
	public void testGetDniLetter7() {
		assertEquals("V","V", calculator.getDniLetter(26950037));
	}
	@Test
	public void testGetDniLetter8() {
		assertEquals("H","H", calculator.getDniLetter(26950038));
	}
	@Test
	public void testGetDniLetter9() {
		assertEquals("L","L", calculator.getDniLetter(26950039));
	}
	@Test
	public void testGetDniLetter10() {
		assertEquals("C","C", calculator.getDniLetter(26950040));
	}
}
