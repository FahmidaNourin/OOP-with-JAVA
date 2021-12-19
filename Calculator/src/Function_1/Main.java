package Function_1;

import java.util.Scanner;

import Calculator.Measurment;
import Calculator.Normal;
import Calculator.NumSys;
import Calculator.Series;
import Calculator.Trigono;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1 for Normal Calculation");
		System.out.println("Enter 2 for Trigonometric Calculation");
		System.out.println("Enter 3 for Numer System Calculation");
		System.out.println("Enter 4 for Measurment Calculation");
		System.out.println("Enter 5 for Series Calculation");
		int decision=input.nextInt();
		
		if( decision==1) {
		Normal nou = new Normal(); 
		float x=input.nextFloat();
		float y=input.nextFloat();
		nou.setAdd(x,y);
		nou.Add();
		float pro=nou.getAdd();
		System.out.println(pro);
		nou.setSub(x,y);
		nou.Sub();
		float pro1=nou.getSub();
		System.out.println(pro1);
		nou.setMul(x,y);
		nou.Mul();
		float pro2=nou.getMul();
		System.out.println(pro2);
		nou.setDiv(x,y);
		nou.Div();
		float pro3=nou.getDiv();
		System.out.println(pro3);
		}
		
		else if(decision==2) {
		Trigono jany=new Trigono();
		jany.setTan(45);
		jany.tan();
		double res=jany.getTan();
		System.out.println(res);
		
		jany.setSin(45);
		jany.sin();
		double res1=jany.getSin();
		System.out.println(res1);
		
		jany.setCos(45);
		jany.Cos();
		double res2=jany.getCos();
		System.out.println(res2);
		}
		
		else if(decision==3) {
		NumSystem raf=new NumSystem();
		raf.setBin(17);
		raf.bin();
		int Bin=raf.getBin();
		System.out.println(Bin);
		
		raf.setHex(17);
		raf.hexa();
		String Hexa=raf.getHex();
		System.out.println(Hexa);
		
		raf.setOct(17);
		raf.oct();
		int Oct=raf.getOct();
		System.out.println(Oct);
		}
		
		else if(decision==4) {
		Measurment fa=new Measurment();
		fa.setRed(5);
		fa.setArms(2,4);
		fa.setArms(2);
		fa.Circale();
		fa.Triangle();
		fa.Square();
		System.out.println(fa.getCircale());
		System.out.println(fa.getTriangle());
		System.out.println(fa.getSquare());
		}
		else if(decision==5)
		{
		
		Series san=new Series();
		san.setSum(0,100,2);
		
		san.setSub(0,100,2);
		san.setMul(0,100,2);
		san.setdiv(0,100,2);
		san.sumSeries();
		
		san.subSeries();
		System.out.println("series ");
		san.MulSeries();
		san.divSeries();
		
		System.out.println("series "+san.getSum());
		System.out.println(san.getSub());
		System.out.println(san.getMul());
		System.out.println(san.getdiv());
		}
		
		

	}

}
