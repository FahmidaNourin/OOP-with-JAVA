package lab4_method;
public class Financial {
	public static double futureInvestmentValue(double investmentAmount, double 
			monthlyInterestRate, int years) {
		double futureInvestmentValue;
		futureInvestmentValue=investmentAmount*Math.pow((1+monthlyInterestRate),(double)(years*12));
		return  futureInvestmentValue;
	}


}
