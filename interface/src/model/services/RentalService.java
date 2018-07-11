package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHours;
	private Double pricePerDay;
	
	private TaxService taxService;
	
	public RentalService() {
	}

	public RentalService(Double pricePerHours, Double pricePerDay, TaxService  taxService) {
		this.pricePerHours = pricePerHours;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHours() {
		return pricePerHours;
	}

	public void setPricePerHours(Double pricePerHours) {
		this.pricePerHours = pricePerHours;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		System.out.println(hours);
		
		double basicPayment;
		
		if(hours <= 12.0) {
			basicPayment = pricePerHours * Math.ceil(hours);
			System.out.println("per hours: " + pricePerHours + " ceil :" + Math.ceil(hours));
			System.out.println("basicPayment: Em horas" + basicPayment);
		}
		else {
			basicPayment =  pricePerDay * Math.ceil(hours/24) ;
			System.out.println("basicPayment: Em dias" + basicPayment);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	
}
