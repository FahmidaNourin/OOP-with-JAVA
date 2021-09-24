package loop_hw1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner bn=new Scanner(System.in);
		int i,n,sum=0;
		n=bn.nextInt();
		 for(i=1;i<=n;i=i+2)
		    {
		        sum=sum+i;
		    }
		 System.out.println("The value of sum "+sum);
		

	}

}
