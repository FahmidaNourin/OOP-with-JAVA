package lab_11_interface;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double percentage=input.nextDouble();
		PercentageDiscount pd=new PercentageDiscount(percentage);
		double price=input.nextDouble();
		double res=pd.discountedPrice(price);
		System.out.println(res);
		Threshold tHreshold=new Threshold(price, percentage);
		double res1=tHreshold.discountedPrice(price);
		System.out.println(res1);
		
		

	}

}
