package com.diamante.Application;

import com.diamante.domain.ComboDevice;
import com.diamante.domain.Printer;
import com.diamante.domain.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Printer p = new Printer("1001");
		p.printer("Carta");
		p.processingDoc("Escrevendo carta");
		
		Scanner s = new Scanner("1002");
		System.out.println(s.scan());
		s.processingDoc("Scanig document");
		
		System.out.println();
		
		ComboDevice cd = new ComboDevice("1003");
		cd.processingDoc("Combo Processing");
		cd.printer("Printing no combo");
		System.out.println(cd.scan());
		
		
		
		
	}

}
