package Car_Boat.copy;

public abstract class Car {
	static private int whil;
	static private String name;
	public Car(int whil,String name) {
		this.whil=whil;
		this.name=name;
	}
	public static int getWhil() {
		return whil;
	}
	public static void setWhil(int whil) {
		Car.whil = whil;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Car.name = name;
	}
	public abstract void speed();
	

}
