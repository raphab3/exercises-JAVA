package entities;

public final class OutSourceEmployee extends Employee{
	
	private Double additionalChange;

	public OutSourceEmployee() {
		super();
	}

	public OutSourceEmployee(String name, Integer hours, Double valuePerHours, Double additionalChange) {
		super(name, hours, valuePerHours);
		this.additionalChange = additionalChange;
	}

	public Double getAdditionalChange() {
		return additionalChange;
	}

	public void setAdditionalChange(Double additionalChange) {
		this.additionalChange = additionalChange;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalChange * 1.1;
	}
	
	
	
}
