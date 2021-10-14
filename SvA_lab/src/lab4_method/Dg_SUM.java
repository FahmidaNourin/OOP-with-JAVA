package lab4_method;

public class Dg_SUM {
	public static int sumDigits(long n) {
	int digit;  
	int  sum = 0;
	while(n > 0)  
	{  
	   
	digit =(int) n % 10;  
	 
	sum = sum + digit;  
	  
	n = n / 10;  
	}  
	
	return sum;  
	}  


}
