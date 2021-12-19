package Mini_Calculator;

public class Calculator3 extends Normal {
	@Override
	double Add(double x, double y) {
		System.out.println("Printing from calculator2 (Add2)");
		return x+y;
		
	}

	@Override
	double Add(double x, double y, double z) {
		System.out.println("Printing from calculator2 (Add3)");
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	double Add(double x, double y, double p, double t) {
		System.out.println("Printing from calculator2 (Add4)");
		// TODO Auto-generated method stub
		return x+y+p+t;
	}

	@Override
	double Sub(double x, double y) {
		System.out.println("Printing from calculator2 (Add2)");
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	double Sub(double x, double y, double z) {
		System.out.println("Printing from calculator2 (Add3)");
		// TODO Auto-generated method stub
		return x-y-z;
	}

	@Override
	double Sub(double x, double y, double p, double t) {
		System.out.println("Printing from calculator2 (Add4)");
		// TODO Auto-generated method stub
		return x-y-p-t;
	}

	@Override
	double Mul(double x, double y) {
		System.out.println("Printing from calculator2 (Add2)");
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	double Mul(double x, double y, double z) {
		System.out.println("Printing from calculator2 (Add3)");
		// TODO Auto-generated method stub
		return x*y*z;
	}

	@Override
	double Mul(double x, double y, double p, double t) {
		System.out.println("Printing from calculator2 (Add4)");
		// TODO Auto-generated method stub
		return x*y*p*t;
	}

	@Override
	double Div(double x, double y) {
		System.out.println("Printing from calculator2 (Add2)");
		// TODO Auto-generated method stub
		return x/y;
	}

	@Override
	double Div(double x, double y, double z) {
		System.out.println("Printing from calculator2 (Add3)");
		// TODO Auto-generated method stub
		return x/y/z;
	}

	@Override
	double Div(double x, double y, double p, double t) {
		System.out.println("Printing from calculator2 (Add4)");
		// TODO Auto-generated method stub
		return x/y/p/t;
	}


}
