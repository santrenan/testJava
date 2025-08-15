package application;

import java.util.Scanner;
import entities.HeightData;

public class Heights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("how many people will you enter? ");
		int n = sc.nextInt();
		HeightData[] vect = new HeightData[n];

		
		for (int i=0; i<n; i++) {
			System.out.println("Data of the " + (i+1) + "° person");
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Age: ");
			int age = sc.nextInt();

			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			HeightData heightData = new HeightData(name, age, height);
			vect[i] = heightData;
		}
		
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getHeight();
		}
		
		double avg = sum / vect.length;
		System.out.println();
		System.out.printf("%nAverage height: %.2f", avg);
		
		int countPeople = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				countPeople += 1;
			}
		}
		
		double percentageOfPeople = (countPeople * 100) / vect.length;
		
		System.out.println();
		System.out.println("People under 16 years of age: " + percentageOfPeople + "%");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}		
		}
		sc.close();
	}
}
