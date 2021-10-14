package lab_6;

public class Stock {
	static private double previousClosingPrice;
	static private double currentPrice;
	public Stock(double p,double c) {
		previousClosingPrice=p;
		currentPrice=c;
	}
	static public double getChangePercent() {
		double rate_of_change;
		rate_of_change=((currentPrice-previousClosingPrice)*100)/previousClosingPrice;
		return rate_of_change;
	}

}
