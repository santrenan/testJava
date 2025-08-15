package application;

import java.util.Scanner;

import entities.PensionatoData;


public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		PensionatoData[] vect = new PensionatoData[10];
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1));
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			PensionatoData pd = new PensionatoData(name, email, room);
			vect[room] = pd;
		}
		
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getRoom() 
						+ ": "
						+ vect[i].getName()
						+ ", "
						+ vect[i].getEmail() );
			}		
		}
		
	
		sc.close();
		
	}

}
