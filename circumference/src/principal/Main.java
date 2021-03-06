package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Circumference: %.2f%n", v);
		System.out.printf("Circumference: %.2f%n", Calculator.PI);
		
		
		sc.close();

	}

}
