package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Exerc1Data;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Exerc1Data> list = new ArrayList<>(n);
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Emplo #" + (i + 1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Exerc1Data employee = new Exerc1Data(id, name, salary);
			list.add(employee);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalaryIncrease = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double percentageSalaryIncrease = sc.nextDouble();
		
			
		System.out.println();
		System.out.println("List of employees:");
		for (Exerc1Data employee : list) {
			if (employee.getId() == idSalaryIncrease) {
				employee.setSalary(employee.getSalary() * (1 + (percentageSalaryIncrease / 100)));
			}
		    System.out.println(employee.getId() + ", " + employee.getName() + ", " + String.format("$%.2f", employee.getSalary()));
		}

		sc.close();
	}
}
