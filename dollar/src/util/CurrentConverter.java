package util;

public class CurrentConverter {
	
	public static final double IOF = 0.06; 
	
	public static double conversor(double dollar, double reais) {
		double result = dollar * reais;
		
		return result += (result * IOF); 
	}
}
