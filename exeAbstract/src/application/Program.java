package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Payer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Payer> payer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualcome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double helthExpenditures = sc.nextDouble();
				payer.add(new Individual(name, anualcome, helthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				sc.nextLine();
				payer.add(new Company(name, anualcome, numberOfEmployee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		double sum = 0.0;
		
		for(Payer p : payer) {
			System.out.println(p.getName() + ": $ " + p.tax());
			sum += p.tax();
		}
		
		System.out.print("TOTAL TAXES: $ " + sum);
		sc.close();
	}

}
