package lab5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		String st=input.nextLine(); 
		if(isPalindrome(st)==true) {
			System.out.println(st+" is palindrom.");
		}
		else
		{
			System.out.println(st+" is not palindrom.");
		}
	}
	public static boolean isPalindrome(String str){  
		String reverseStr = "";
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      return true;
	    }
	    else {
	    return false;
	    		}
	}  

}
