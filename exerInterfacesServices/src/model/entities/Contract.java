package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValueContract;
	
	List<Installment> installments = new ArrayList<>();

	public Contract() {
	}

	public Contract(Integer number, Date date, Double totalValueContract) {
		this.number = number;
		this.date = date;
		this.totalValueContract = totalValueContract;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValueContract() {
		return totalValueContract;
	}

	public void setTotalValueContract(Double totalValueContract) {
		this.totalValueContract = totalValueContract;
	}

	public List<Installment> getInstalltmens() {
		return installments;
	}

	public void setInstalltmens(List<Installment> installtmens) {
		this.installments = installtmens;
	}
	
	
}
