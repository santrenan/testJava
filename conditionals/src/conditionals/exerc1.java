package conditionals;

import java.util.Scanner;

public class exerc1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double priceToPay = 50;
		int baseMinutes = 100;
		int minutesConsumed, additional;
		
		System.out.println("How many minutes consumed?");
		minutesConsumed = sc.nextInt();
		
		if (minutesConsumed > baseMinutes) {
			additional = (int) ((minutesConsumed - baseMinutes) * 2.0);
			priceToPay += additional;
		}
		
		System.out.printf("Price to pay: $%.2f", priceToPay);
	
		sc.close();
	}
	
}
