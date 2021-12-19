package lab_12;

public class Triangle extends polygon {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(int numSide, double sideA, double sideB, double sideC) {
		super(numSide);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public double area() {
		
		double s;
		s=(sideA+sideB+sideC)/2;
		return Math.sqrt(s*(s -sideA)*(s -sideB)*(s - sideC));
	}
	@Override
	public double perimeter() {
		
		return (sideA+sideB+sideC);
	}


}
