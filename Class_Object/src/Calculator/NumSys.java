package Calculator;

public class NumSys {
	static int bin(int N) {

		int B_Number = 0;
		int cnt = 0;
		while (N != 0) {
			int rem = N % 2;
			double c = Math.pow(10, cnt);
			B_Number += rem * c;
			N /= 2;

			cnt++;
		}

		return B_Number;
	}

	static String hexa(int n) {
		return (Integer.toHexString(n));
	}

	static int oct(int deciNum) {
		int octalNum = 0, countval = 1;
		while (deciNum != 0) {

			int remainder = deciNum % 8;

			octalNum += remainder * countval;

			countval = countval * 10;
			deciNum /= 8;
		}
		return (octalNum);
	}

}
