package com.diamante.domain;

public class Printer extends Device implements PrinterInterface{

	
	
	public Printer(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processingDoc(String doc) {
		System.out.println("Printer processing: " + doc);

		
	}
	
	@Override
	public void printer(String doc) {
		System.out.println("Printing: " + doc);
	}
}
