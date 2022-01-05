package Car_Boat;

public class Hybrid extends Car implements Boat{

	public Hybrid(int whil, String name) {
		super(whil, name);
		
	}

	@Override
	public void speed() {
		System.out.println("It can run");
	}

	@Override
	public void swime() {
		System.out.println("it can swim");
		
	}
	public String toString() {
		return "whil :"+super.getWhil()+" name :"+super.getName();
	}
	
	

}
