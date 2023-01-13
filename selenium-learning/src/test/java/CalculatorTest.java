import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import dev.failsafe.internal.util.Assert;
import jan11.Calculator;


public class CalculatorTest {
	
	
	private Calculator calculator;
	
	@Before
	public void setup() {
		
		calculator = new Calculator();
		System.out.println("BEfore");
		
	}
	
	@Test
	public void addTest() {
		
		int res = this.calculator.add(new int[] {1,2});
		
		Assertions.assertEquals(res, 3);
	}
	
	@Test
	public void addNegativeNumbersTest() {
		
		int res = this.calculator.add(new int[] {-1,-2});
		
		Assertions.assertEquals(res, -3);
	}
	

}
