package Car_Boat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String  name=input.nextLine();
		int whil=input.nextInt();
		Hybrid hybrid=new Hybrid(whil, name);
		hybrid.speed();
		hybrid.swime();
		String res=hybrid.toString();
		System.out.println(res);

	}

}
