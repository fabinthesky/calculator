package main.java.math;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	private Calc calc;

	@Before
	public void setUp() throws Exception {
		this.calc = new Calc();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		assertEquals(2, this.calc.addition(1, 1), 0);
	}

	@Test
	public void testSubstraction() {
		assertEquals(1, this.calc.substraction(2, 1), 0);
	}

	@Test
	public void testDivision() {
		assertEquals(1, this.calc.division(2, 2), 0);
		assertEquals(3.333, this.calc.division(10, 3), 0.001);
		assertEquals(Double.POSITIVE_INFINITY, this.calc.division(2, 0), 0);
	}

	@Test 
	public void testMultiplication() {
		assertEquals(6, this.calc.multiplication(2, 3), 0);
		assertEquals(9, this.calc.multiplication(3, 3), 0);
	}

	@Test
	public void testSquare() {
		assertEquals(9, this.calc.square(3), 0);
		assertEquals(16, this.calc.square(4), 0);
	}


}
