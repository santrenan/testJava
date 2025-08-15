package application;

import java.util.Scanner;

import entities.BankEntities;


public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account_number = sc.nextInt();
		
        sc.nextLine();  

		System.out.print("Enter account holder: ");
		String account_holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit: ");
		char is_initial_value = sc.nextLine().charAt(0);

		
		double initial_value_deposit = 0;
		if (is_initial_value == 'y') {
			System.out.print("Enter initial deposit value: $");
			initial_value_deposit = sc.nextDouble();
		}
		
		
		BankEntities bankInfo = new BankEntities(
				account_number,
				account_holder,
				initial_value_deposit); 
		
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bankInfo.toString());
		
	
		System.out.println();
		
		System.out.print("Enter a deposit value: $");
		double deposit = sc.nextDouble();
		bankInfo.deposit(deposit); 
		
		System.out.println();
		System.out.println("Update account data:");
		System.out.println(bankInfo.toString());
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: $");
		double withdraw = sc.nextDouble();
		bankInfo.withdraw(withdraw); 
		
		System.out.println();
		System.out.println("Update account data:");
		System.out.println(bankInfo.toString());
		
		
		sc.close();
	}

}
