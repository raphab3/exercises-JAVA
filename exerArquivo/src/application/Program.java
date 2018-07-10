package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Double price = 0.0;
		Integer quantity = 0;
		
		List<Product> products = new ArrayList<>();
		
		String path = "C:\\workspace\\wp-eclipse\\exerArquivo\\in.csv";
		File strPath = new File(path);
		String parent = strPath.getParent(); 
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String name = line.split(",")[0];
				String valueS = line.split(",")[1];
				price = Double.parseDouble(valueS);
				String quantityS = line.split(",")[2];
				quantity = Integer.parseInt(quantityS.substring(0,1));
				products.add(new Product(name, price, quantity));
				line = br.readLine();
			}
		}
		catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
		boolean success = new File(parent + "\\out").mkdir();
		
		String pathFull = parent + "\\out" + "\\summary.csv";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathFull))){
			for(Product product : products) {
				bw.write(product.toString());
				bw.newLine();
				System.out.println(product);
			}
			System.out.println("Directory created successfully: " + success);
		}
		catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
