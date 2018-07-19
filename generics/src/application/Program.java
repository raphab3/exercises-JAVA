package application;

import java.util.Scanner;

import domain.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Valor #" + i + ": ");
			ps.addList(sc.nextInt());
			sc.nextLine();

		}
		System.out.println();
		ps.print();	
		
		System.out.println();
		System.out.println("first: "+ps.first());
				
		sc.close();
	}

}
