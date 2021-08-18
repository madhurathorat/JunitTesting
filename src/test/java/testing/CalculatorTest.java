package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {// DRY
	Calculator calculator;

	@BeforeEach
	public void init() {
		calculator = new Calculator();
		System.out.println("init");
	}

	// AAA - Arrange , Act, Assert
	@Test
	void testAdd() {
		int result = calculator.add(1, 3);
		assertEquals(4, result, "Test Failed");
	}

	@Test
	void testAddFloat() {
		float result = calculator.add(1.2F, 3.1F);
		assertEquals(4.3, result, 0.0000003);
	}
	
	@Test
	void testAddFloatIfGreaterthat2() {
		float result = calculator.add(3.0F, 2.1F);
		assertEquals(5.1, result, 0.0000001);
	}

	@Test
	public void testDivideWhenDenom0() {
		try {
			calculator.divide(1, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}
	}

	@Test
	public void testDivide() {
		double result = calculator.divide(1, 2);
		assertEquals(0.0, result);
	}
}
