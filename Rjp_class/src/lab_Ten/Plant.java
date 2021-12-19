package lab_Ten;

public class Plant {
	static private String name;
	static private String color;
	public Plant(String name,String color) {
		this.name=name;
		this.color=color;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Plant.name = name;
	}
	public static String getColor() {
		return color;
	}
	public static void setColor(String color) {
		Plant.color = color;
	}
	@Override
	public String toString() {
		return "name:"+name+"color:"+color;
	}
	
	

}
