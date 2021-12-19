package Override;

public class Chicken extends Bird{
	static void leg_pice() {
		System.out.println("chicken has leg pices");
	}
	
	@Override
	void legs(String b) {
		System.out.println(b+" Has two legs.");
		System.out.println(b+" Has two theng.");
	}

}
