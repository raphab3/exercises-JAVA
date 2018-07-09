package vector2;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite numero de produtos: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(nome, price);
			sum += vect[i].getPrice();
		}
		
		double media = sum / vect.length;
		System.out.printf("Media de Preco dos produtos: %.2f%n", media );
		
		sc.close();
	}

}
