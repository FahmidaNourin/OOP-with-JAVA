package NumSystem;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int c=input.nextInt();
		NumSystem numsystem=new NumSystem();
		int binary=numsystem.convert(c);
		System.out.println(binary);
		
		
	

	}

}
