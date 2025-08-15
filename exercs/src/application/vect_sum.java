package application;

import java.util.Scanner;

public class vect_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many numbers will you enter? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.printf("%nValues = ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(" " + vect[i]);
		}
		
		
		System.out.printf("%nSoma = " + sum);
		System.out.printf("%nAverage = %.2f", sum / vect.length);	
		
		sc.close();
	}

}
