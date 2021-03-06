package dollar;

import java.util.Locale;
import java.util.Scanner;

import util.CurrentConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double reais = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrentConverter.conversor(dollar , reais) );
		
		
		sc.close();
	}

}
