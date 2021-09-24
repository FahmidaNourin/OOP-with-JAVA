package loop_hw2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner bp=new Scanner(System.in);
		int i,n,sum=1;
		n=bp.nextInt();
		for(i=2;i<=n;i=i*2)
	    {
	        sum=sum*i;

	    }
		 System.out.println("The value of sum "+sum);
			
		
		

	}

}
