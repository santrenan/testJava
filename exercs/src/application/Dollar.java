package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Dollar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amountOfDollars = sc.nextDouble();
				
		CurrencyConverter converter = new CurrencyConverter(dollarPrice, amountOfDollars);
		double result = converter.getConvertedValue();
		
		System.out.printf("Amount to be paid in reais = R$%.2f", result);
		
		sc.close();
	}

}
