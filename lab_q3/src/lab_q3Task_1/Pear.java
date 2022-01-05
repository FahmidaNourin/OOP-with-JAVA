package lab_q3Task_1;

public class Pear extends Fruit implements Cookable{

	public Pear(String furniture, String color) {
		super(furniture, color);
		
	}

	@Override
	public void taste() {
		System.out.println("Sweet taste");
		
	}

	@Override
	public void howToCook() {
		System.out.println("Cannot cook");
		
	}
	public String toString() {
		return "fruitname:"+super.getFruitname()+"  color :"+super.getColor();
	}
	

}
