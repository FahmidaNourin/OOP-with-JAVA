package lab_6;

public class Main {

	public static void main(String[] args) {
		Rectengle gp=new Rectengle(2,3);
		double area=gp.getArea();
		System.out.println(area);
		
		
		Stock bb=new Stock(40,30);
		double result=bb.getChangePercent();
		System.out.println(result);
		
		

	}

}
