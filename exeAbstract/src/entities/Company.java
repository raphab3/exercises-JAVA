package entities;

public class Company extends Payer{
	private Integer numberOfEmployee;

	public Company() {
		super();
	}
	
	public Company(String name, Double anualcome, Integer numberOfEmployee) {
		super(name, anualcome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double tax() {
		Double result = 0.0;
		if(numberOfEmployee > 10) {
			result = (anualcome * 0.14);
		}else {
			result = (anualcome * 0.16);
		}
		return result;
	}

	@Override
	public String toString() {
		return String.format("%.2f", tax());
	}
	
	
	
}
