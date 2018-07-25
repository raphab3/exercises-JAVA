package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\workspace\\wp-eclipse\\exerLambda2Fix\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			String line = br.readLine();
			while(line != null) {
				String name = line.split(",")[0];
				String email = line.split(",")[1];
				String valueS = line.split(",")[2];
				double salary = Double.parseDouble(valueS);
				list.add(new Employee(name, email, salary));
//				System.out.println(list.size());
				
				line = br.readLine();
			}
			
		
			System.out.println("Digite um salario para pesquisa: ");
			double salary = sc.nextDouble();
			
			List<String> emails = list.stream()
								  .filter(e -> e.getSalary() > salary)
								  .map(e -> e.getEmail())
								  .sorted()
								  .collect(Collectors.toList());
			
			
			
			emails.forEach(System.out::println);
			System.out.println();
			
			double sum = list.stream()
						 .filter(e -> e.getName().charAt(0) == 'M')
						 .map(e -> e.getSalary())
						 .reduce(0.0, (x,y) -> x + y);
						 
			System.out.println("Sum of salary of people whose name starts with 'M': R$ " + String.format("%.2f", sum));
		}
		catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}
		
		
		sc.close();

	}

}
