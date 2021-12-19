package Eception_3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		  Scanner input= new Scanner(System.in);
	        try {
	        	System.out.println("Enter the radius:");
		         double r= input.nextDouble();
		         double  area=(22*r*r)/7 ;
		         System.out.println("Area of Circle is: " + area);
	        }
	        catch(Exception e) {
				System.out.println(e);
				System.out.println("Invalied input");
			}
      
	   }
		

	}


