package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double amountPaid(double dollarBought, double dollarPrice) {
		double totalDollar = dollarBought * dollarPrice;
		return totalDollar + (totalDollar * IOF);

	}
	 
}
