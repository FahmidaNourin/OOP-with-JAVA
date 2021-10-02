package Ecapsulation;

public class Main {

	public static void main(String[] args) {
		
		Area n=new Area(1.2,42);
		double tri2= n.Triangle();
		System.out.println(tri2);
		double tri= n.Triangle();
		System.out.println(tri);
	}

}
