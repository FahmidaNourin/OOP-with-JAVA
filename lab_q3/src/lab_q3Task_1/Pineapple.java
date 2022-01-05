package lab_q3Task_1;

public class Pineapple extends Fruit implements Cookable{

	public Pineapple(String fruitname, String color) {
		super(fruitname, color);

	}

	@Override
	public void taste() {
		System.out.println("Sour taste");
		
	}

	@Override
	public void howToCook() {
		System.out.println("Cooking is possible");
		
	}
	public String toString() {
		return "fruitname:"+super.getFruitname()+"  color :"+super.getColor();
	}

}
