package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Valor #" + i + ": ");
			Integer valor = sc.nextInt();
			ps.addList(valor);
			lista.add(valor);
			sc.nextLine();

		}
		
		
		System.out.println();
		ps.print();	
		
		System.out.println();
		System.out.println("first: "+ps.first());
		
		
		
		System.out.println();
		System.out.println("Maior Valor:  " + ps.max(lista));
				
		sc.close();
	}

}
