package leap_year;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner charge=new Scanner(System.in);
		int year;
		System.out.println("Enter the Year");
		year=charge.nextInt();
		if((year%400==0)||((year%100!=0)&&(year%4==0)))
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This year is not leap year");
		}
		
	}

}
