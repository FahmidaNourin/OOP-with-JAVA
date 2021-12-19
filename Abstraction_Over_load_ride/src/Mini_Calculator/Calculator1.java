package Mini_Calculator;

public class Calculator1 extends Normal {

	@Override
	double Add(double x, double y) {
		return x+y;
		
	}

	@Override
	double Add(double x, double y, double z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	double Add(double x, double y, double p, double t) {
		// TODO Auto-generated method stub
		return x+y+p+t;
	}

	@Override
	double Sub(double x, double y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	double Sub(double x, double y, double z) {
		// TODO Auto-generated method stub
		return x-y-z;
	}

	@Override
	double Sub(double x, double y, double p, double t) {
		// TODO Auto-generated method stub
		return x-y-p-t;
	}

	@Override
	double Mul(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	double Mul(double x, double y, double z) {
		// TODO Auto-generated method stub
		return x*y*z;
	}

	@Override
	double Mul(double x, double y, double p, double t) {
		// TODO Auto-generated method stub
		return x*y*p*t;
	}

	@Override
	double Div(double x, double y) {
		// TODO Auto-generated method stub
		return x/y;
	}

	@Override
	double Div(double x, double y, double z) {
		// TODO Auto-generated method stub
		return x/y/z;
	}

	@Override
	double Div(double x, double y, double p, double t) {
		// TODO Auto-generated method stub
		return x/y/p/t;
	}

}
