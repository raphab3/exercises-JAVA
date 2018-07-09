package entities;

public class Student {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	public String aprovacao() {
		if (notaFinal() > 60){
			return "Pass";
			
		}else {
			return "FAILED \n" + "Missign " + String.format("%.2f", 60 - notaFinal()) + " Points" ;
		}
	}
	
	@Override
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f%n", notaFinal())  + 
			   aprovacao(); 
				
	}
		
	
	
	
	
}
