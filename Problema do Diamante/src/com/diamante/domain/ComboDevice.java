package com.diamante.domain;

public class ComboDevice extends Device implements ScannerInterface, PrinterInterface{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processingDoc(String doc) {
		System.out.println("Combo Processing: " + doc);
	}
	
	
	@Override
	public  String scan() {
		return "Scannig: combo";
	}
	
	@Override
	public void printer(String doc) {
		System.out.println("Printing: " + doc);
	}

}
