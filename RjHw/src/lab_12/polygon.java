package lab_12;

public abstract class polygon {
	private int  numSide;
	public polygon(int  numSide) {
	
		this. numSide= numSide;
	}
	public int getNumSide() {
		return numSide;
	}
	public void setNumSide(int numSide) {
		this.numSide = numSide;
	}
	public abstract double area();
	public abstract double perimeter();

}
