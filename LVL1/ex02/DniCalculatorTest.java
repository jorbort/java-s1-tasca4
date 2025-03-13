package LVL1.ex02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DniCalculatorTest {
	
	DniCalculator calculator;

	@Before
    public void setUp() {
        calculator = new DniCalculator();
    }

	@Test
	public void testGetDniLetter() {
		assertEquals("Letter not as expected","B", calculator.getDniLetter(26950031));
	}

	@Test
	public void testGetDniLetter2() {
		assertEquals("Letter not as expected","N", calculator.getDniLetter(26950032));
	}
	@Test
	public void testGetDniLetter3() {
		assertEquals("Letter not as expected","J", calculator.getDniLetter(26950033));
	}

	@Test 
	public void testGetDniLetter4() {
		assertEquals("Letter not as expected","Z", calculator.getDniLetter(26950034));
	}

	@Test
	public void testGetDniLetter5() {
		assertEquals("Letter not as expected","S", calculator.getDniLetter(26950035));
	}
	@Test
	public void testGetDniLetter6() {
		assertEquals("Letter not as expected","Q", calculator.getDniLetter(26950036));
	}
	@Test
	public void testGetDniLetter7() {
		assertEquals("Letter not as expected","V", calculator.getDniLetter(26950037));
	}
	@Test
	public void testGetDniLetter8() {
		assertEquals("Letter not as expected","H", calculator.getDniLetter(26950038));
	}
	@Test
	public void testGetDniLetter9() {
		assertEquals("Letter not as expected","L", calculator.getDniLetter(26950039));
	}
	@Test
	public void testGetDniLetter10() {
		assertEquals("Letter not as expected","C", calculator.getDniLetter(26950040));
	}
}
