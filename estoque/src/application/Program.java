package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Produto: ");
		String nome = sc.nextLine();
		
		System.out.printf("Digite o valor do Produto: ");
		double price = sc.nextDouble();
		
		System.out.printf("Digite a quantidade do Produto: ");
		int quantity = sc.nextInt();
		
		Product p1 = new Product(nome, price, quantity);
		
		System.out.println(p1);
		
		System.out.printf("Adicionar quantas unidades? : ");
		quantity = sc.nextInt();
		p1.addProducts(quantity);
		System.out.println(p1);
		
		System.out.printf("Adicionar quantas unidades? : ");
		quantity = sc.nextInt();
		p1.removeProducts(quantity);
		System.out.println(p1);
		
		if(nome.intern() == "Rafael") {
			System.out.println("Digitou Rafael");
		}else {
			System.out.println("Nome errado");
		}
		
		
		
		sc.close();

	}

}
