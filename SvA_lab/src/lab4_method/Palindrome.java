package lab4_method;

public class Palindrome {
	public static int reverse(int number) {
		int  reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		return reverse;  
	}
	
	
	public static boolean isPalindrome(int number) {
		int rev=reverse(number);
		if(rev==number) {
			return true;
		}
		else
		{
			return false;
		}
		
	}


}
