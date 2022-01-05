package AreaOfCircale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double Area=0;
		try {
			double r=input.nextDouble();
			Area=3.1416*r*r;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(Area);

	}

}
