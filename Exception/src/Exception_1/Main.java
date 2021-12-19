package Exception_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		 
		try {
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num3=num1/num2;
			System.out.println("The dividation is "+num3);
			}
			catch(Exception e) {
				System.out.println(e);
				System.out.println("Invalid input!!");
				System.out.println("Abar ashben, DHonnobad!!");
				
			}
		
		System.out.println("Hello world outside catch");
		
		
		
		
		
	}

}
