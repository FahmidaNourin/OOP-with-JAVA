package PrimeNumber;

public class PrimeNumber {
	public static boolean isprime(int num) {
		 
	      int i,count=0;
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	      return true;
	      else
	         return false;
	   }
}



