package lab4_method;

public class Matrix {
	public static void printMatrix(int n) {

	    for (int column = 0; column < n; column++) {
	        for (int row = 0; row < n; row++) {
	            System.out.printf("%1d ", (int) (Math.random() * 2));
	        }
	        System.out.println("");
	    }

	}
}
