package Function_1;

public class Series {
	static private double start;
	static private double end;
	static private double diff;
	static private double return1;
	static private double start2;
	static private double end2;
	static private double diff2;
	static private double return2;
	static private double start3;
	static private double end3;
	static private double diff3;
	static private double return3;
	static private double start4;
	static private double end4;
	static private double diff4;
	static private double return4;
	
	
	
	
	static void setSum(double s,double e,double d) {
		start=s;
		end=e;
		diff=d;
		
	}
	
	
	static void sumSeries() {

        double sum = 0;
  
        
        for (double x = start; x <= end; x=x+diff) {
            sum = sum + x;
        }
        return1=sum;
    
	}
	static double getSum() {
		return return1;
	}
	
	static void setSub(double s,double e,double d) {
		start=s;
		end=e;
		diff=d;
		
	}
	
	
	static void subSeries() {

        double sub = 0;
  
        
        for (double x = start2; x <= end2; x=x+diff2) {
            sub = sub - x;
        }
        return2=sub;
    
	}
	static double getSub() {
		return return2;
	}
	static void setMul(double s,double e,double d) {
		start3=s;
		end3=e;
		diff3=d;
		
	}
	
	
	static void MulSeries() {

        double mul = 1;
  
        
        for (double x = start3; x <= end3; x=x+diff3) {
            mul = mul*x;
        }
        return3=mul;
    
	}
	static double getMul() {
		return return3;
	}
	
	static void setdiv(double s,double e,double d) {
		start=s;
		end=e;
		diff=d;
		
	}
	
	
	static void divSeries() {

        double div = 1;
  
        
        for (double x = start4; x <= end4; x=x+diff4) {
            div = div/x;
        }
        return4=div;
    
	}
	static double getdiv() {
		return return4;
	}
	
	


}
