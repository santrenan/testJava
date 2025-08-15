package application;

import java.util.Scanner;

public class PairNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many numbers will you enter? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int num = 0;
		for (int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("");
		System.out.println("Pairs Numbers:");
		int countPairs = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				countPairs += 1;
				System.out.print(vect[i] + " ");
			}
		}
		
		System.out.printf("%n%n");
		System.out.println("Quantities of pairs = " + countPairs);


		
		sc.close();
	}

}
