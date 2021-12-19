package Encapsulation_1;

public class Leap_Year {
	private static int year;
	private static boolean return1;
	static void setYear(int x) {
		year=x;
	
	}
	static void leapyear() {
    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
    {
        return1=true;
    }
    else{
       return1=false;
    }
	}
    static boolean getRes() {
    	return return1;
    }

}
