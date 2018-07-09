package entities;

public abstract class Payer {
	private String name;
	protected Double anualcome;
	
	public Payer() {
	}

	public Payer(String name, Double anualcome) {
		super();
		this.name = name;
		this.anualcome = anualcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualcome() {
		return anualcome;
	}

	public void setAnualcome(Double anualcome) {
		this.anualcome = anualcome;
	}
	
	public abstract Double tax();
	
	
}
