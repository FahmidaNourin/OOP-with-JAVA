package lab_11_interface;

public class PercentageDiscount implements Discountable{
	private double percentage;
	public PercentageDiscount(double percentage) {
		this.percentage=percentage;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	





	@Override
	public double discountedPrice(double price) {
		double res;
		res=(price*(percentage/100));
		
		return (price-res);
	}

}
