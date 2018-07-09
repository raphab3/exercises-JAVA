package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Digite as medidas do triandulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triandulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("O valor da areaX: %.4f%n", areaX);
		System.out.printf("O valor da areaY: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.printf("A maior area eh: X");
		}else {
			System.out.printf("A maior area eh: Y");
		}			
		sc.close();
		

		
		
	}

}
