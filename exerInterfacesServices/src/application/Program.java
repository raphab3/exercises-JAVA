package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data : ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double totalValueContract = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Contract contract = new Contract(number, date, totalValueContract);
		
		ContractService cs = new ContractService();
		cs.processContract(contract, n);
		
		System.out.println();
		System.out.println("Installments: ");
		for (Installment con : contract.getInstalltmens()) {
			System.out.println(sdf.format(con.getDate().getTime()) + " - " + con.getAmount());
		}
		
		sc.close();
	}

}
