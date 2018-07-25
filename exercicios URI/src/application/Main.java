package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		int n = sc.nextInt();
		int ante = 0;
		int atual = 1;
		
		
		list.add(ante);
		list.add(atual);
		
		
		for(int i=1; i<=n; i++ ) {
			
			int prox = atual + ante;
			list.add(prox);
			list2.add(sc.nextInt());
			ante = atual;
			atual = prox;
						
		}
		
		for(int i = 0; i<n; i++) {		
			System.out.println("Fib("+list2.get(i)+") = " + list.get(list2.get(i)));
		}
		
		System.out.println(list);
		sc.close();	
		
	}
}
