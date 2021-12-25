package lab_11_interface;

public class Threshold implements Discountable{
	private double threshold;
	private double discount;
	public Threshold(double threshold, double discount) {
		super();
		this.threshold = threshold;
		this.discount = discount;
	}
	public double getThreshold() {
		return threshold;
	}
	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public double discountedPrice(double price) {
		double res;
		res=price*(discount/100);
		return price-res;
	}
	

}
