package Fibonacci;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int f=input.nextInt();
		int s=input.nextInt();
		Fibonacci fibonacci=new Fibonacci();
		fibonacci.isfibonacci(n, f, s);
		

	}

}
