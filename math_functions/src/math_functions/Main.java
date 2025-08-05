package math_functions;

public class Main {
	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrade de " + x + " = " + A);
		System.out.println("Raiz quadrade de " + y + " = " + B);
		System.out.println("Raiz quadrade de 25 = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		B = Math.abs(z);
		A = Math.abs(y);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		int a = 4;
		int b = 10;
		int c = -3;
		
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.printf("%n(%d) + (%d) + (%d) = 0%n", a, b, c);
		System.out.printf("delta = %.2f%nx1 = %.2f%nx2 = %.2f", delta, x1, x2);
		
	}
}
