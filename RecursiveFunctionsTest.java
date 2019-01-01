/**
 * @author Ethan Wong
 */
package cis385.ch8;

import static org.junit.Assert.*;
import org.junit.Test;

public class RecursiveFunctionsTest {

	@Test
	public void repeatZeroTimesReturnsEmptyString() {

		RecursiveFunctions functions = new RecursiveFunctions();

		assertEquals("", functions.repeat("Happy", 0));

	}

	@Test
	public void repeatReturnsStringRepeated() {

		RecursiveFunctions functions = new RecursiveFunctions();

		assertTrue("HappyHappyHappy".equals(functions.repeat("Happy", 3)));

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void repeatThrowsIllegalArgumentExceptionForNegativeTimes() {

		RecursiveFunctions functions = new RecursiveFunctions();

		functions.repeat("Happy", -5);

	}

	@Test
	public void containsReturnsFalseForEmptyString() {
		
		RecursiveFunctions functions = new RecursiveFunctions();

		assertFalse(functions.contains("", 'a'));
		
	}

	@Test
	public void containsReturnsFalseCharNotFound() {
		
		RecursiveFunctions functions = new RecursiveFunctions();

		assertFalse(functions.contains("Tamil", 'e'));
		
	}

	@Test
	public void containsReturnsTrueForCharAtBeginning() {
		
		RecursiveFunctions functions = new RecursiveFunctions();

		assertTrue(functions.contains("Tamil", 'T'));
		
	}

	@Test
	public void containsReturnsTrueForCharInMiddle() {
		
		RecursiveFunctions functions = new RecursiveFunctions();

		assertTrue(functions.contains("Tamil", 'm'));
		
	}

	@Test
	public void containsReturnsTrueForCharAtEnd() {
		
		RecursiveFunctions functions = new RecursiveFunctions();

		assertTrue(functions.contains("Tamil", 'l'));
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void fibonacciThrowsIllegalArgumentExceptionForNegativeArg(){
		
		RecursiveFunctions functions = new RecursiveFunctions();
		functions.fibonacci(-1);
	}
	
	@Test
	public void fibonacciReturnsZeroForZeroArg(){
		
		RecursiveFunctions functions = new RecursiveFunctions();
		assertEquals(0, functions.fibonacci(0));
	}
	
	@Test
	public void fibonacciReturnsOneForOneArg(){
		
		RecursiveFunctions functions = new RecursiveFunctions();
		assertEquals(1, functions.fibonacci(1));
	}
	
	@Test
	public void fibonacciReturnsThirteenForSeventh(){
		
		RecursiveFunctions functions = new RecursiveFunctions();
		assertEquals(13, functions.fibonacci(7));
	}
	
	
	@Test
	public void multiplyGetsZeroWhenEitherNumberIsZero() {
		RecursiveFunctions functions = new RecursiveFunctions();
		functions.multiply(1, 0);
	}
	
	@Test
	public void multiplyReturnsMultipliedValueWithPositiveVariables() {
		RecursiveFunctions functions = new RecursiveFunctions();
		assertEquals(12, functions.multiply(2,6));
	}
	
	@Test
	public void multiplyReturnsMultipliedValueWithOneNegativeVariables() {
		RecursiveFunctions functions = new RecursiveFunctions();
		assertEquals(-12, functions.multiply(2,-6));
		assertEquals(-12, functions.multiply(-2,6));
		assertEquals(12, functions.multiply(-2,-6));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void powerNegativeExponentThrowsIllegalArgumentException() {
		RecursiveFunctions functions = new RecursiveFunctions();
		functions.power(2,-6);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void powerZeroExponentAndBaseThrowsIllegalArgumentException() {
		RecursiveFunctions functions = new RecursiveFunctions();
		functions.power(0,0);
	}
	
	@Test
	public void powerWithPositiveIntegersReturnsCorrectValue() {
		RecursiveFunctions functions = new RecursiveFunctions();
		assertEquals(1000, functions.power(10,3));
		assertEquals(1000000, functions.power(100,3));
		assertEquals(64, functions.power(4,3));
	}
	
	@Test
	public void powerWithNegativeIntegersReturnsCorrectValue() {
		RecursiveFunctions functions = new RecursiveFunctions();
		assertEquals(-1000, functions.power(-10,3));
		assertEquals(-64, functions.power(-4,3));
		assertEquals(-4096, functions.power(-16,3));
	}
	
	@Test
	public void powerWithFractionalBaseReturnsRightValue() {
		RecursiveFunctions functions = new RecursiveFunctions();
		assertEquals(10000, functions.power(100.0, 2), 0.000001); 
		assertEquals(1015075.125, functions.power(100.5, 3), 0.000001); 
		assertEquals(0.0001, functions.power(100.0, -2), 0.000001); 
		assertEquals(0.0001020304, functions.power(-99.0, -2), 0.00001); 
	}
	
	@Test
	public void gcdTestWithVariousValues() {
		RecursiveFunctions functions = new RecursiveFunctions();
		
		assertEquals(5, functions.gcd(10, 5));
		assertEquals(3, functions.gcd(1701, 3768));
		assertEquals(5, functions.gcd(-10, 5));
		assertEquals(0, functions.gcd(0, 0));
	}
	
	@Test
	public void isPalindromeTest() {
		RecursiveFunctions functions = new RecursiveFunctions();
		
		assertEquals(true, functions.isPalindrome("madam, I'm adam"));
		assertEquals(false, functions.isPalindrome("madam, I'm ethan"));
		assertEquals(true, functions.isPalindrome("obo"));
		assertEquals(true, functions.isPalindrome("o"));
		assertEquals(true, functions.isPalindrome(""));
	}
	
	
	
	
	

}
