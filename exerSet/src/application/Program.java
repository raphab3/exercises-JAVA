package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Set<Aluno> set = new HashSet<>();

		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++) {
			int cod = sc.nextInt();
			set.add(new Aluno(cod));
		}
		
		System.out.print("How many students for course B? ");
		int x = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<x; i++) {
			int cod = sc.nextInt();
			set.add(new Aluno(cod));
		}
		
		System.out.print("How many students for course C? ");
		int y = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<y; i++) {
			int cod = sc.nextInt();
			set.add(new Aluno(cod));
		}
		
		System.out.println("Total de Alunos: " + set.size());
		
		sc.close();

	}

}
