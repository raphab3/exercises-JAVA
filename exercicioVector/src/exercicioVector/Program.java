package exercicioVector;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will de rented?");
		double n = sc.nextDouble();
		
		Estudantes[] vect = new Estudantes[(int) n];
		
		int cont = 1;
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Rent: " + cont);
			
			System.out.println("Nome: ");
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.printf("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Estudantes(name, email, room);

			cont += 1;
			
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0; i<vect.length; i++) {
			
			System.out.println(vect[i].getRoom() + ": " 
							 + vect[i].getName() + ", " 
					         + vect[i].getEmail());
		}
		
		
		for(Estudantes obj : vect) {
			System.out.println(obj);
		}
		
		
		
		sc.close();
	}

}

