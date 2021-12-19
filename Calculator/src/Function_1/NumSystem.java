package Function_1;

public class NumSystem {
	static private int number;
	static private int number1;
	static private int number2;
	static private int return1;
	static private String return2;
	static private int return3;
	static void setBin(int N) {
		number=N;
	}
	static void bin() {

		int B_Number = 0;
		int cnt = 0;
		while (number != 0) {
			int rem = number % 2;
			double c = Math.pow(10, cnt);
			B_Number += rem * c;
			number /= 2;

			cnt++;
		}

		return1= B_Number;
	}
	static int getBin() {
		return return1;
	}
	static void setHex(int N) {
		number1=N;
	}
	

	static void hexa() {
		return2= (Integer.toHexString(number1));
	}
	static String getHex() {
		return return2;
	}
	static void setOct(int N) {
		number2=N;
	}

	static void oct() {
		int octalNum = 0, countval = 1;
		while (number2!= 0) {

			int remainder =number2 % 8;

			octalNum += remainder * countval;

			countval = countval * 10;
			number2 /= 8;
		}
		return3= (octalNum);
	}
	static int getOct() {
		return return3;
	}
	


}
