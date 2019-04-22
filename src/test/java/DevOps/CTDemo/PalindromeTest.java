package DevOps.CTDemo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for Palindrome Checker.
 */
public class PalindromeTest {

	String input1 = "racecar";
	String input2 = "WILP";
	String input3 = "";
	PalindromeServlet app = new PalindromeServlet();

	
	@Test
	public void isPlaindromeTest() {
		assertEquals(input1+" is a Palindrome", app.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		assertEquals(input2+" is not a Palindrome", app.isPalindrome(input2));
	}

	@Test
	public void isNullPlaindromeTest() {
		assertEquals("Input should not be null", app.isPalindrome(input3));
	}

}