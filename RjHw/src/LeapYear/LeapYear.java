package LeapYear;

public class LeapYear {
	public static boolean lyear(int year) {
		  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		        return true;
		      else
		         return false;
	}

}
