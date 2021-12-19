package Atm;

public class Machine2 extends ATM {

	@Override
	void ReceiveCard() {
		System.out.println("Only Credit Card");
		
	}

	@Override
	void Ammount() {
		System.out.println("Max Withdraw 50k");
		
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
		System.out.println("Max 20 Digit Pin");
		
	}
   
}
