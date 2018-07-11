package model.services;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	public void processContract(Contract contract, Integer month) throws ParseException {
		
		Date date = contract.getDate();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);	

		PaypalService ps = new PaypalService();
		
		for(int i =1; i <= month; i++) {
		cal.setTime(date);
		cal.add(Calendar.MONTH, i); //adiciona meses
		
		Date d = cal.getTime(); 
		double amount = contract.getTotalValueContract() / month;
		contract.getInstalltmens().add(new Installment(d, ps.interest(ps.paymentFee(amount), i)));
		cal.clear();
		}
		
		
	}

	
}
