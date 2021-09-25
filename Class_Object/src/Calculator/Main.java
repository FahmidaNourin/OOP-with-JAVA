package Calculator;

public class Main {

	public static void main(String[] args) {

		Normal nou = new Normal(); // nou is the object of Normal class

		double sum;
		sum = nou.Add(10, 5);

		System.out.println(" The sumation is: " + sum);

		double sub;
		sub = nou.Sub(12, 23);
		System.out.println("The subtraction: " + sub);
		
		
		Trigono hp=new Trigono();
		double tan;
		tan=hp.tan(45);
		System.out.println(" The Tan is: " + tan);
		
		double sin;
		sin=hp.sin(45);
		System.out.println(" The Sin is: " + sin);
		
		double cos;
		cos=hp.cos(45);
		System.out.println(" The Cos is: " + cos);
		
		

	}

}
