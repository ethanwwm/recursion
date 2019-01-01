package cis385.ch8;

/**
 * Interface specifying a set of functions to be implemented via recursion.
 * @author Gene Rohrbaugh
 * @version 1.1
 * @modified October 2016
 */
public interface RecursiveFunctionsInterface {

	/**
	 * Returns the given string repeated the given number of times
	 * @param string the string to be repeated
	 * @param times the number of times
	 * @return string repeated number of times
	 * @throws IllegalArgumentException if times is less than 0
	 */
	public String repeat(String string, int times)
			throws IllegalArgumentException;

	/**
	 * Returns true if string contains character, false otherwise
	 * @param string the string to be checked
	 * @param character the character being searched for
	 * @return true if string contains character, false otherwise
	 */
	public Boolean contains(String string, char character);

	public int fibonacci(int n) throws IllegalArgumentException;

	public int multiply(int x, int y);

	public int power(int base, int exponent) throws IllegalArgumentException;

	public double power(double base, int exponent);

	public int gcd(int x, int y);

	public boolean isPalindrome(String phrase);

}
