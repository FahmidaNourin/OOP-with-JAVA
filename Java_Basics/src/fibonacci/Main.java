package fibonacci;
import java.util.*; 
public class Main {

	public static void main(String[] args) {
		Scanner sp=new Scanner(System.in);
		int  i,n,x=0,y=1,z=0;
		n=sp.nextInt();
		System.out.println("The value of  x"+x);
		System.out.println("The value of  y"+y);
		 for(i=1;i<=n;i++)
		    {
		        z=x+y;
		        System.out.println("The value of z "+z);
		        x=y;
		        y=z;

		    }
		

	}

}
