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
		
		NumSys ik=new NumSys();
		int bin;
		bin=ik.bin(2);
		System.out.println(" The value is " + bin);
		
		String hexa;
		hexa=ik.hexa(15);
		System.out.println(" The value is " + hexa);
		
		int oct;
		oct=ik.oct(8);
		System.out.println(" The value is " + oct);
		
		Measurment jp=new Measurment();
		double Circale;
		Circale=jp.Circale(2);
		System.out.println(" The  circale area is " +Circale);
		
		double Triangle;
		Triangle=jp.Triangle(4,5);
		System.out.println(" The  circale area is " +Triangle);
		
		double Square;
		Square=jp.Square(2);
		System.out.println(" The  square area is " +Square);
		
		Ecuation np=new Ecuation();
		double[] Equation2 =new double[2];
		Equation2=np.Equation2(1,2,3,4,5,6);
		System.out.println(" The x is " +Equation2[0]+ " and y is "+Equation2[1]);
		
		double inputs[][]= {{2,-1,3,9},
								{1,1,1,6},
								{1,-1,1,2}};
		double[] Equation3=np.Equation3(inputs);
		
		System.out.println(" The x is " +Equation3[0]+ " y is "+Equation3[1]+" z is "+Equation3[2]);
		
		
		
		
		
		
	
		
		
		

	}

}
