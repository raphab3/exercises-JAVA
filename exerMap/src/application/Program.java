package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\workspace\\wp-eclipse\\exerMap\\in.txt";
		
		Map<String, Integer> votes = new HashMap<>();
	
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			Integer total = 0;
			String name = null;
			Integer qtdVotos = null;
			while(line != null) {
				name = line.split(",")[0];
				qtdVotos = Integer.parseInt(line.split(",")[1]);
				
				
				if(votes.containsKey(name)) {
					total = votes.get(name); //retorna o valor de acordo com a chave
					votes.put(name, qtdVotos + total);
				}else {
					votes.put(name, qtdVotos);
				}

				line = br.readLine();
			}
		}
		catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
		
		System.out.println("ALL Candidatos:"); 
		

		
		for (String key : votes.keySet()) { 
			
			System.out.println(key + ": " + votes.get(key)); 
			
		}

		sc.close();

	}

}
