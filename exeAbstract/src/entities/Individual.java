package entities;

public class Individual extends Payer{
	private Double helthExpenditures;

	public Individual() {
		super();
	}
	
	
	public Individual(String name, Double anualcome, Double helthExpenditures) {
		super(name, anualcome);
		this.helthExpenditures = helthExpenditures;
	}
	
	public Double getHelthExpenditures() {
		return helthExpenditures;
	}


	public void setHelthExpenditures(Double helthExpenditures) {
		this.helthExpenditures = helthExpenditures;
	}


	@Override
	public Double tax() {
		Double result = 0.0;
		if(anualcome < 20000.00) {
			result = (anualcome * 0.15) - (helthExpenditures * 0.5);
		}else {
			result = (anualcome * 0.25) - (helthExpenditures * 0.5);
		}
		return result;
	}


	@Override
	public String toString() {
		return String.format("%.2f",tax()) ;
	}
	
	
	
	
}
