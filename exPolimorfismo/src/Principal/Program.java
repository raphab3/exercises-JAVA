package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
		List<Employee> listEmployee = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #"+i+ " data:");
			System.out.println("Outsourced (y/n)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Value per hours: ");
			double valuePerHours = sc.nextDouble();
			
			if(c == 'y') {
				System.out.print("Additional charge: ");
				double additionalChange = sc.nextDouble();
				listEmployee.add(new OutSourceEmployee(name, hours, valuePerHours, additionalChange));
			}else {
				listEmployee.add(new Employee(name, hours, valuePerHours));
			}	
		}
		System.out.println();
		System.out.println("Paymets: ");
		for(Employee emp :listEmployee ) {
			System.out.print(emp);
		}
		sc.close();
	}

}
