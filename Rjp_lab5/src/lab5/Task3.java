package lab5;
import java.util.*;
public class Task3 {
	public static double balance=0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			int dis=input.nextInt();
			if(dis==1) {
				System.out.println("Enter Deposit ammount:");
				double amnt=input.nextDouble();
				deposit(amnt);
			}
			else if(dis==2) {
				System.out.println("Enter withdraw ammount:");
				double amnt=input.nextDouble();
				withdraw(amnt);
			}
			else if(dis==3) {
				System.out.println("Your Balance is :"+ balance);
			}
			else if(dis==4) {
				break;
			}
			else {
				System.out.println("Invalid Input");
			}
		}

	}
	
	public static void deposit(double amount) {
		 
		balance = balance+amount;                                                                                                
	}
	
	public static void withdraw(double amount) {
		 
		balance = balance-amount;                                                                                                
	}
	
	

}
