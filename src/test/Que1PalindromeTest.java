package test;

import static org.junit.Assert.*;
import main.Que1Palindrome;

import org.junit.Test;

public class Que1PalindromeTest {

	//POSITIVE SCNARIO
	@Test
	public void testIsPalindrome() {
		Que1Palindrome que=new Que1Palindrome();
		System.out.println(que.isPalindrome("aabbcbbaa"));
		
		assertEquals(true, que.isPalindrome("aabbcbbaa"));
		
	}
	//NEGATIVE SCNARIO
	
	@Test
	public void testIsPalindrome_1() {
		Que1Palindrome que=new Que1Palindrome();
		System.out.println(que.isPalindrome("aabbcbbaa"));
		assertEquals(false,que.isPalindrome("rahul"));
		
	}
}
