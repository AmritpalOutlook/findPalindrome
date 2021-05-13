import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


class FindPalindromeApplicationTests {

	@Test                                               
	@DisplayName("Simple find nearest palindrome")   
	public void testNearestPalindromic() {
		assertEquals("Nearest Palindrome", JUnitTestHelper.EXPECTED_PALINDROME,FindPalindrome.findNearestPalindromic(JUnitTestHelper.GIVEN_NUMBER));         
	}

	@Test    
	@DisplayName("Simple find nearest palindrome large number- 13334")   
	public void testNearestPalindromicLargeNumber() {
		assertEquals("Nearest Palindrome", JUnitTestHelper.EXPECTED_PALINDROME_LARGE,FindPalindrome.findNearestPalindromic(JUnitTestHelper.GIVEN_LARGE_NUMBER));         
	}

	//This test should fail as it does not handle for Alphabets yet
	@RepeatedTest(5)                                    
	@DisplayName("Negative scenario for Alphabets")
	public void testWithAlphabets() {
		assertEquals("Nearest Palindrome", JUnitTestHelper.EXPECTED_ALHABET_RESULT,FindPalindrome.findNearestPalindromic(JUnitTestHelper.GIVEN_ALPHABET));  
	}
}
