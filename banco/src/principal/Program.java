package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta c1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int nConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String nome = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		double initialDeposit = 0;

		if (resposta == 'y') {
			System.out.printf("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			c1 = new Conta(nConta, nome, initialDeposit);
			
		}else {
			c1 = new Conta(nConta, nome);
		}
		
		
		
		System.out.println("Account data: " +  c1);
		
		System.out.printf("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		c1.depositar(deposito);
		System.out.printf("Update data: " +  c1);
		
		System.out.printf("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		c1.sacar(saque);
		System.out.println("Update data: " +  c1);
		
		sc.close();

	}

}
