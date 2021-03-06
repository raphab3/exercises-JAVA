package exercicioMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamanho da Matriz: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Escolha um valor da matriz: ");
		int x = sc.nextInt();
		
		int count = 0;
		
		for(int i=0; i<mat.length-1; i++) {
			for(int j=0; j<mat[i].length-1; j++) {
				if(mat[i][j] == x) {
					
					System.out.println("Posicao: " + i + "," + j);
					
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
						
					}
					if(i > 0) {
						System.out.println("UP: " + mat[i-1][j]);
					}
					
					if(j + 1 <= mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if(i + 1 <= mat.length-1 ) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
					System.out.println("");
					count++;
				}
			}
		}
		System.out.println("Ocorrências: " + count);
		
		
		
		sc.close();
	}

}
