package conditionals;

public class ternary_conditional {

	public static void main(String[] args) {
		double price = 34.5;
		double discount = (price < 20) ? price * 0.1 : price * 0.05;
		
		
		System.out.printf("Price: %.2f%nDiscount: %.2f", price, discount);
	}

}
