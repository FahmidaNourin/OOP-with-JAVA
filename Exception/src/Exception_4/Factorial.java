package Exception_4;

public class Factorial {
	private static int number;
	private static int return1;
	static void setnum(int a) {
		number=a;
	}
	static void fact() {
	 int i,fact=1;  
	    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	 return1=fact;    
	 }  
	static int getFact() {
		return return1;
	}

}
