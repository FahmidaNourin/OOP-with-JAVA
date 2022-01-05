package lab_q3Task_1;

public abstract class Fruit {
	static private String fruitname;
	static private String color;
	public Fruit(String fruitname,String color) {
		Fruit.fruitname=fruitname;
		Fruit.color=color;
	}
	public static String getFruitname() {
		return fruitname;
	}
	public static void setFruitname(String fruitname) {
		Fruit.fruitname = fruitname;
	}
	public static String getColor() {
		return color;
	}
	public static void setColor(String color) {
		Fruit.color = color;
	}
	public abstract void taste();

}
