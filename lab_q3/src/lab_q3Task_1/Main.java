package lab_q3Task_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String fruitname=input.nextLine();
		String color=input.nextLine();
		Pineapple pineapple=new Pineapple(fruitname, color);
		pineapple.taste();
		pineapple.howToCook();
		String res1=pineapple.toString();
		System.out.println(res1);
		Pear pear=new Pear(fruitname, color);
		pear.taste();
		pear.howToCook();
		String res2=pear.toString();
		System.out.println(res2);
		

	}

}
