package Exception_4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		Factorial factorial=new Factorial();
		factorial.setnum(num);
		factorial.fact();
	
		
		int res=factorial.getFact();
		System.out.println(res);
		
		
		

	}

}
