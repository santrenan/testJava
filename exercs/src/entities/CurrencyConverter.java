package entities;

public class CurrencyConverter {
	private double dollarPrice;
	private double amountOfDollars;
	private static final double IOF= 6.0;
	
	// construtor deve ter o mesmo nome da classe
	public CurrencyConverter(double dollarPrice, double amountOfDollars) { 
		this.dollarPrice = dollarPrice;
		this.amountOfDollars = amountOfDollars;
	}
	
	public double getConvertedValue() {
		return (dollarPrice * amountOfDollars) * (1 + IOF / 100);
	}
}
