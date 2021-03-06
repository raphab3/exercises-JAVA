package entities;

public class Product {
	public String nome;
	public double price;
	public int quantity;
	
	public Product(String nome, double price, int quantity) {
		this.nome = nome;
		this.price = price;
		this.quantity = quantity;
	}
	
	

	public Product(String nome, double price) {
		this.nome = nome;
		this.price = price;
	}



	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; 
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity; 
	}

	@Override
	public String toString() {
		return "Product data: " 
			   + nome 
			   + ", "
			   + String.format("%.2f", price) + ", "
			   + quantity + " units"
			   + ", Total="
			   + String.format("%.2f", totalValueInStock()) ;
	}
	
	
}
