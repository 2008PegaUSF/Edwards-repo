import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import Calculator.CalculatorTest;

class TestCalculator {

	CalculatorTest ct = new CalculatorTest();
	
	@Test
	void testAdd() {
		Assertions.assertEquals(4, ct.calculate("2 + 2"));
		Assertions.assertNotEquals(0, ct.calculate("2 + 2"));
	}
	
	@Test
	void testSubtract() {
		Assertions.assertEquals(3, ct.calculate("6 - 3"));
		Assertions.assertNotEquals(0, ct.calculate("6 - 3"));
	}
	
	@Test
	void testMulti() {
		Assertions.assertEquals(3, ct.calculate("1 * 3"));
		Assertions.assertNotEquals(0, ct.calculate("4 * 2"));
	}
	
	@Test
	void testDivi() {
		Assertions.assertEquals(3, ct.calculate("6 / 2"));
		Assertions.assertNotEquals(0, ct.calculate("4 / 2"));
	}
	
	@Test
	void testMod() {
		Assertions.assertEquals(0, ct.calculate("4 % 2"));
		Assertions.assertNotEquals(0, ct.calculate("3 % 2"));
	}

}
