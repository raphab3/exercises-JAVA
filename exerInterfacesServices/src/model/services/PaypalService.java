package model.services;

public class PaypalService implements OnlinePaymentService {
	
	public Double interest(Double amount, Integer month) {
		amount += amount * 0.01 * month;
		return amount;
	}
	
	public  Double paymentFee(Double amount) {
		return amount +=  amount * 0.02;
	}
	
}
