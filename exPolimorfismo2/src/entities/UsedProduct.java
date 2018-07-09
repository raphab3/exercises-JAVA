package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactuDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactuDate) {
		super(name, price);
		this.manufactuDate = manufactuDate;
	}

	public Date getManufactuDate() {
		return manufactuDate;
	}

	public void setManufactuDate(Date manufactuDate) {
		this.manufactuDate = manufactuDate;
	}
	
	@Override
	public final String priceTag() {
		return  getName() 
				+ " (Used) $ " 
				+ String.format("%.2f", price) 
				+ " "  
				+ "(Manufacture date: " + sdf.format(manufactuDate) + ")";
	}
	
	
	
	
}
