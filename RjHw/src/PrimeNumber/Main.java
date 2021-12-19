package PrimeNumber;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int p=input.nextInt();
		
		PrimeNumber primenumber=new PrimeNumber();
		boolean prime=primenumber.isprime(p);
		System.out.println(prime);
				
	

	}

}
