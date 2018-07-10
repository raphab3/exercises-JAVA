package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	
		
		String path = "C:\\workspace\\wp-eclipse\\arquivos\\in.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
				String line = br.readLine();
				
				while(line != null) {
					System.out.println(line);
					line = br.readLine();
				}
			}catch(IOException e) {
				System.out.println("Erro :" + e.getMessage());
		}
			
		
	}

}
