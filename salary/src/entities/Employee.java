package entities;

public class Employee {
	public String nome;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		this.grossSalary += grossSalary * (percentage / 100);  
	}
	@Override
	public String toString() {
		return nome +  ", " + String.format("$ %.2f", netSalary()) ;
	}
	
	
}
