package leapYear;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		LeapYear leapyear=new LeapYear();
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		boolean y=leapyear.isleapyear(year);
		System.out.println(y);

	}

}
