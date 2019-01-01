package cis385.ch8;

/**
 * Implementation of recursive functions specified in
 * RecursiveFunctionsInterface
 * @author Gene Rohrbaugh
 * @version 1.1
 * @modified October 2018 by Ethan Wong
 *
 */
public class RecursiveFunctions implements RecursiveFunctionsInterface{

	/**
	 * Returns the given string repeated the given number of times
	 * @param string the string to be repeated
	 * @param times the number of times
	 * @return string repeated number of times
	 * @throws IllegalArgumentException if times is less than 0
	 */
	public String repeat(String string, int times) {

		if (times < 0)
			throw new IllegalArgumentException("times must be non-negative");
		else if (times == 0)
			return "";
		else
			return string + repeat(string, times - 1);
	}

	/**
	 * Returns true if string contains character, false otherwise
	 * @param string the string to be checked
	 * @param character the character being searched for
	 * @return true if string contains character, false otherwise
	 */
	public Boolean contains(String string, char character) {

		if (string.length() == 0)
			return false;
		else if (string.charAt(0) == character)
			return true;
		else
			return contains(string.substring(1), character);
	}

	@Override
	/**
	 * @author Ethan Wong
	 * Returns the nth Fibonacci number
	 * @param n number in sequence to be returned 
	 * @returns the nth Fibonacci number
	 * @throws IllegalArgumenException if n < 0
	 */
	public int fibonacci(int n) throws IllegalArgumentException {
		
		if(n < 0) {
			throw new IllegalArgumentException("n must be >= 0");
		} else if(n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

	/**
	 * @author Ethan Wong
	 * Returns the product of x and y
	 * @param x and y positive values
	 * @returns product 
	 * @throws IllegalArgumenException if n < 0
	 */
	@Override
	public int multiply(int x, int y) {
		
		if(x == 0 || y == 0) {
			return 0;
		} else {
			if(y > 1) {
				return x + multiply(x , y - 1);
			} else if(y == 1) {
				return x;
			} else if(y < 0) {
				return -(x + multiply(x , -y - 1));
			}
		}
		
		return 0;
	}

	@Override
	/**
	 * @author Ethan Wong
	 * Returns the result of a base to a power
	 * @param base the value to be repeated
	 * @param exponent the number of times the base is repeated
	 * @returns result of powered base
	 * @throws IllegalArgumenException if exponent < 0 or base & exponent == 0
	 */
	public int power(int base, int exponent) throws IllegalArgumentException {
		
		if(exponent < 0) {
			throw new IllegalArgumentException("Exponent must not be a negative value");
		} else if(base == 0 && exponent == 0) {
			throw new IllegalArgumentException("0 to the power of 0 is not accepted");
		} else if(base == 0) {
			return 0;
		} else if(exponent == 0) {
			return 1;
		}
		else {
			if(exponent > 1)
				return base * power (base, exponent - 1);
			else
				return base;
		}
	}

	@Override
	/**
	 * @author Ethan Wong
	 * Returns the result of a base to a power
	 * @param base the value to be repeated
	 * @param exponent the number of times the base is repeated
	 * @returns result of powered base
	 * @throws IllegalArgumenException if base & exponent == 0
	 */
	public double power(double base, int exponent) throws IllegalArgumentException {
		if(base == 0 && exponent == 0) {
			throw new IllegalArgumentException("0 to the power of 0 is not accepted");
		} else if(base == 0) {
			return 0;
		} else if(exponent == 0) {
			return 1;
		} else if (exponent < -1){
			return (1 / base) * power ((1 / base), exponent + 1);
		} else if(exponent > 1) {
			return base * power (base, exponent - 1);
		} else
			return base;
	}

	@Override
	/**
	 * @author Ethan Wong
	 * Returns the common denominator between two integers
	 * @param x and y integers to find the common denominator
	 * @returns x or y depending on which is larger than the other
	 */
	public int gcd(int x, int y) {
		if(x < 0) {
			x = -(x);
		}
		
		if(y < 0) {
			y = -(y);
		}
		
		if(x > y) {
			if(y == 0) {
				return x;
			} else {
				return gcd(y, x%y);
			}
		} if(x < y) {
			if(x == 0) {
				return y;
			} else {
				return gcd(x, y%x);
			}
		}
		return 0;
	}

	/**
	 * @author Ethan Wong
	 * Returns true if the string is a palindrome and false otherwise.
	 * @param phrase string to check if is a palindrome
	 * @returns true or false
	 */
	@Override
	public boolean isPalindrome(String phrase) {
		phrase = phrase.toUpperCase();
		phrase = phrase.toLowerCase();
		
		phrase = phrase.replaceAll("[^a-z]", "");
		
		if(phrase.length() <= 1) {
			return true;
		}
		if(phrase.charAt(0) == phrase.charAt(phrase.length() - 1)) {
			return isPalindrome(phrase.substring(1, phrase.length() - 1));
		}
		
		return false;
	}

}
