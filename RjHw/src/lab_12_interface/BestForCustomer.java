package lab_12_interface;

public class BestForCustomer implements Discountable {
	private double percentage;
	private double threshold;
	private double discount;
	public BestForCustomer(double percentage, double threshold, double discount) {
	
		this.percentage = percentage;
		this.threshold = threshold;
		this.discount = discount;
	}
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
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
		double res1;
		double res2;
		res1=price*(discount/100);
		res2=price*(threshold/100);
		if(res1>res2) {
			return price-res1;
		}
		else {
			return price-res2;
		}
		
		
	}
	
	

}
