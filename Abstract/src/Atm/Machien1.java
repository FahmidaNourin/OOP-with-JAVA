package Atm;

public class Machien1 extends ATM {

	@Override
	void ReceiveCard() {
		System.out.println("Only Debit Card");
		
	}

	@Override
	void ReceivePin() {
	 System.out.println("Max Six Digit Pin");
		
	}

	@Override
	void Ammount() {
		System.out.println("Max Withdraw 25k");
		
	}

	@Override
	void ReturnCard() {
		System.out.println("Return Card");
		
	}

	@Override
	void GiveMoney() {
		System.out.println("Give Money");
		
	}

}
