package com.diamante.domain;

public class Scanner extends Device implements ScannerInterface{

	public Scanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processingDoc(String doc) {
		System.out.println("Scanner Processing: " + doc);
		
	}
	
	@Override
	public String scan() {
		return "Scannig content";
	}

}
