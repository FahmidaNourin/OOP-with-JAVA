package factorial;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num,fact=1,i=1;
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println("The Factorial of "+num+"!= "+fact);

	}

}
