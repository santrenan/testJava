package input_data;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		*/
		
		/*
		int y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		*/
		
		/*
		double z = sc.nextDouble();
		System.out.printf("Você  digitou: %.2f", z);
		*/
		
		char alpha = sc.next().charAt(0);
		System.out.println("Você digitou: " + alpha);
		sc.close();
	}

}
