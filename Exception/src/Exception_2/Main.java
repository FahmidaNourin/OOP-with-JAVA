package Exception_2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		try {
			char a=input.next().charAt(0);
            System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
			}

}
