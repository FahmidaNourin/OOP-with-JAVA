package LeapYear;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int y=input.nextInt();
		LeapYear leapyear=new LeapYear();
		boolean year=leapyear.lyear(y);
		System.out.println(year);
		

	}

}
