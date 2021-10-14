package lab4_method;

public class Sort3number {
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp;

	    if (num2 < num1) {
	      temp = num1;
	      num1 = num2;
	      num2 = temp;
	    }

	    if (num3 < num2) {
	      temp = num2;
	      num2 = num3;
	      num3 = temp;
	    }

	    if (num2 < num1) {
	      temp = num1;
	      num1 = num2;
	      num2 = temp;
	    }

	   System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(num3);
	  }
	}


