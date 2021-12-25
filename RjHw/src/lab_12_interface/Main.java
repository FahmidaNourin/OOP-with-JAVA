package lab_12_interface;
import java.util.*;

import lab_11_interface.PercentageDiscount;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double Discout=input.nextDouble();
		double percentage=input.nextDouble();
		double trashHold=input.nextDouble();
		
		BestForCustomer pd=new BestForCustomer(percentage,trashHold,Discout);
		double price=input.nextDouble();
		double res=pd.discountedPrice(price);
		System.out.println(res);

	}

}
