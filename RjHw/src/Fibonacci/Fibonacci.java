package Fibonacci;

public class Fibonacci {
	public static void isfibonacci(int n,int firstTerm,int secondTerm) {
		
	    
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	}

}
