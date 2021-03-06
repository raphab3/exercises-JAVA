package exercicioList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list =  new ArrayList<>();
		
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		
		for(int i=1; i<=n; i++) {
			System.out.printf("Employee #" + i + ":\n");
			System.out.println("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			
			sc.nextLine();
	
			list.add(new Employee(id, name, salary));
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int selectId = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == selectId).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!\n");
		}else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("List of employees: ");
		for (Employee x : list) {
			System.out.print(x);
		}
		
		
		sc.close();
	}

}
