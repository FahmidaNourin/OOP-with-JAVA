package Calculator;

public class Measurment {
	static double Circale(int radius) {

		double pi = 3.142, area;

		area = pi * radius * radius;

		return (area);
	}

	static double Triangle(double h, double b) {
		double area;
		area = (h * b) / 2;
		return (area);
	}

	static int Square(int side) {
		int area = side * side;
		return area;
	}

}
