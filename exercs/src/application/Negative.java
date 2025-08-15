package application;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many numbers will you enter? ");
		int n = sc.nextInt();

		if (n >= 10) {
			System.out.println("Invalid number.");
		}
		else {
			int[] vect = new int[n];
			int countNeg = 0;
			
			
			for (int i=0; i<n; i++) {
				System.out.print("enter a number: ");
				int num = sc.nextInt();
				if (num < 0) {
					vect[countNeg] = num;
					countNeg++;
				}
			}
			
		if (vect.length >= 1) {
			System.out.println("Negatives number(s):");
			for (int i=0; i<countNeg; i++) {
				System.out.println(vect[i]);
			}	
		}
		else {
			System.out.println("There is no number.");
		}
		
		
		sc.close();
			
		}
	}

}
