package Calculator;

public class Ecuation {
	static double[] Equation2(double a, double b, double c, double d, double e, double f) {
	    double det = 1/ ((a) * (d) - (b) * (c));
	    double x = ((d) * (e) - (b) * (f)) / det;
	    double y = ((a) * (f) - (c) * (e)) / det;
	    
	    double[] ar= new double[2];   // array 
	   
	    ar[0]=x;
	    ar[1]=y;
	    return ar;
	}
	
	static double determinantOfMatrix(double mat[][])
	{
	    double ans;
	    ans = mat[0][0] * (mat[1][1] * mat[2][2] - mat[2][1] * mat[1][2])
	        - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
	        + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
	    return ans;
	}
	 
	
	
	static double[] Equation3(double coeff[][])
	{
	    
	    double d[][] = {
	        { coeff[0][0], coeff[0][1], coeff[0][2] },
	        { coeff[1][0], coeff[1][1], coeff[1][2] },
	        { coeff[2][0], coeff[2][1], coeff[2][2] },
	    };
	     
	    
	    double d1[][] = {
	        { coeff[0][3], coeff[0][1], coeff[0][2] },
	        { coeff[1][3], coeff[1][1], coeff[1][2] },
	        { coeff[2][3], coeff[2][1], coeff[2][2] },
	    };
	     
	    
	    double d2[][] = {
	        { coeff[0][0], coeff[0][3], coeff[0][2] },
	        { coeff[1][0], coeff[1][3], coeff[1][2] },
	        { coeff[2][0], coeff[2][3], coeff[2][2] },
	    };
	     
	    
	    double d3[][] = {
	        { coeff[0][0], coeff[0][1], coeff[0][3] },
	        { coeff[1][0], coeff[1][1], coeff[1][3] },
	        { coeff[2][0], coeff[2][1], coeff[2][3] },
	    };
	 
	    
	    double D = determinantOfMatrix(d);
	    double D1 = determinantOfMatrix(d1);
	    double D2 = determinantOfMatrix(d2);
	    double D3 = determinantOfMatrix(d3);   
	    
	       double[] ar=new double[3];
	         ar[0]  = D1 / D;
	         ar[1]  = D2 / D;
	         ar[2]  = D3 / D; 
	        return ar;
	    
	     
	    
	}
	

}
