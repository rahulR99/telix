package main;

public class Que1Palindrome {
	
	String getPalindromeString(String input){
		char []arr=input.toCharArray();
		int len=arr.length;
		char temp;
			for(int i=0;i<len/2;i++){
				temp=arr[i];
				arr[i]=arr[len-1-i];
				arr[len-1-i]=temp;
			}
		return new String(arr);
	}
	
 public boolean isPalindrome(String str){
	 String result=getPalindromeString(str);
	 if(str.equals(result)){
		 System.out.println("["+str+"] is palindrome");
		 return true;
	 }
	 System.out.println("["+str+"] is not palindrome");
	 return false;
 }
}
