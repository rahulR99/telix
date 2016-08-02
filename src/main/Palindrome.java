package main;

import java.util.Scanner;

public class Palindrome {
	  public static void main(String args[])
	  {
	    String inputString;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Enter a string");
	    inputString = in.nextLine();
	 
	    int length  = inputString.length();
	    int i, start, end, middle;
	 
	    start  = 0;
	    end    = length - 1;
	    middle = (start + end)/2;
	 
	    for (i = start; i <= middle; i++) {
	      if (inputString.charAt(start) == inputString.charAt(end)) {
	        start++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    if (i == middle + 1) {
	      System.out.println("given String is Palindrome");
	    }
	    else {
	      System.out.println("Not a palindrome");
	    } 	
	  }
	}
