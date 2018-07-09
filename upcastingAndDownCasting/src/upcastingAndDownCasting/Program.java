package upcastingAndDownCasting;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		Account acc = new Account(1001, "Rafael", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Carla", 0.0, 500.0);
		SavingsAccount sacc = new SavingsAccount(1004, "Rodrigo", 10.0, 0.001);
		Account acc5 = new SavingsAccount(1005, "Lucca", 2000.00, 0.001);
		
		//UpCasting
		
		acc = bacc;
		acc = sacc;
		
		acc = new BusinessAccount(1003, "Renato", 0.0 , 300.0);
		
		
//		DownCasting
		
		bacc = (BusinessAccount)acc;
		
//		bacc = ( BusinessAccount)sacc; Erro de cara
		
		if(acc5 instanceof BusinessAccount) {
			BusinessAccount acc4 = (BusinessAccount)acc5; //Apresenta erro após a execução,  até então acc5 aparenta ser Account 
			acc4.loan(200.00);
			System.out.println("Loan sucessu! acc4 eh BussinessAcount");
		}
		
		if(bacc instanceof BusinessAccount) {
			bacc = (BusinessAccount)acc;
			bacc.loan(5000.0);
			System.out.println("Loan sucessu! bacc eh BussinessAcount");
		}
		
		Account conta = new Account(1001, "Rafael batista", 0.0);
		conta.deposit(1000.0);
		System.out.println("Saldo, in conta :" + conta.getBalance());
		
		conta.withdraw(200.0);
		System.out.println("Saldo in conta: "+ conta.getBalance());
		
		//Método sobreposto
		
		BusinessAccount contaB = new BusinessAccount(1002, "Carla", 1000.0, 500.0);
		contaB.withdraw(200.0);
		System.out.println("Saldo, in contaB :" + contaB.getBalance());
		
		SavingsAccount contaP = new SavingsAccount(1004, "Rodrigo", 1000.0, 0.001);
		contaP.withdraw(200.0);
		System.out.println("Saldo, in contaP :" + contaP.getBalance());
	}
		

}
