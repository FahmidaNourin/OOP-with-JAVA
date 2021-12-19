package Atm;

public class Machine3 extends ATM {

	@Override
	void ReceiveCard() {
		System.out.println("Credit and Debit Card");
		
	}

	@Override
	void Ammount() {
		System.out.println("Max Withdraw 80k");
		
	}

	@Override
	void ReturnCard() {
		
		System.out.println("Return Card");
	}

	@Override
	void GiveMoney() {
		System.out.println("Give Money");
		
	}

	@Override
	void ReceivePin() {
		System.out.println("Max 25 Digit Pin");
		
	}
}
