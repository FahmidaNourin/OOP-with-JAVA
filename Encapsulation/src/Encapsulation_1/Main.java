package Encapsulation_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("For leapyear press 1 & For evenodd press 2");
		int decission=input.nextInt();
		if(decission==2) {
			System.out.println("Enter a number");
		int num=input.nextInt();
		
		Even_Odd evenodd=new Even_Odd();
		evenodd.setValue(num);
		evenodd.evenodd();
		boolean res=evenodd.getRes();
		System.out.println(res);
		}
		
		else if(decission==1) {
			System.out.println("Enter the year");
			int year=input.nextInt();
		
		Leap_Year leapyear=new Leap_Year();
		leapyear.setYear(year);
		leapyear.leapyear();
		boolean res2=leapyear.getRes();
		System.out.println(res2);
		}
		
	}

}
