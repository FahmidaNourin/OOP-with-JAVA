package lab_Ten;

public class Flower extends Plant{
	static private boolean hasSmell;
	static private boolean hasThorn;

	public Flower(String name, String color,boolean hasSmell,boolean hasThorn) {
		super(name, color);
		this.hasSmell=hasSmell;
		this.hasThorn=hasThorn;
		
	}

	public static boolean isHasSmell() {
		return hasSmell;
	}

	public static void setHasSmell(boolean hasSmell) {
		Flower.hasSmell = hasSmell;
	}

	public static boolean isHasThorn() {
		return hasThorn;
	}

	public static void setHasThorn(boolean hasThorn) {
		Flower.hasThorn = hasThorn;
	}
	@Override
	public String toString() {
	return "Smell:"+hasSmell+"Thorn:"+hasThorn;
	}

}
