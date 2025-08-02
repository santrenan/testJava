package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// byte age = 20;
		double num = 20.3312312312;
		int num2 = 100;
		
		System.out.printf("%.2f%n", num);
		System.out.printf("%.4f%n", num);
		
		System.out.println("Resultado = " + num + "m²");
		System.out.printf("Resultado = %.2f m² | %d%n", num, num2);
		
		String name = "Maria";
		int age = 31;
		double salary = 1750.45;
		System.out.printf("%s tem %d anos e ganha R$%.2f%n", name, age, salary);
		
	}

}
