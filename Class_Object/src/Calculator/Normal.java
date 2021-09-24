package Calculator;

public class Normal {
		
	static double Add(double a, double b) {   // this is a method
			return a+b;
		}
	static float Sub(float a, float b) {   // this is a method
		return a-b;
	}
	static float Mul(float a, float b) {   // this is a method
		return a*b;
	}
	static float Div(float a, float b) {   // this is a method
		return a/b;
	}
	
	static void go() {
		int a=30,b=30;
		int c=a+b;
		System.out.println("This is the Go function in Normal class and the sum is  "+c);
	}
	
}
