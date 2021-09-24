package less_or_greater;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner nou=new Scanner(System.in);
		int a,b;
		System.out.println("Value of a");
		a=nou.nextInt();
		System.out.println("Value of b");
		b=nou.nextInt();
		if(a>b)
		{
			System.out.println("The biggest "+a);
		}
		else 
		{
			System.out.println("less"+b);
		}
		
		
	}

}
