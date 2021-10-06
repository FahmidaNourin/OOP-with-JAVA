package Ecapsulation;

public class Main {

	public static void main(String[] args) {

		Area n = new Area();
		n.setArms(1.2, 0.4);
		n.Triangle();
		double tri2 = n.getTri();
		System.out.println(tri2); //triangle
		
		n.setArms(77);
		n.Square();
		double sqr=n.getSqr();
		System.out.println(sqr);//square
		

	}
}
