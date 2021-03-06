package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private Client client = new Client();
	
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItens() {
		return items;
	}

	public void addItens(OrderItem items) {
		this.items.add(items);
	}
	
	public void removeItems(OrderItem items) {
		this.items.remove(items);
	}
	
	public Double total() {
		double sum = 0;
		for(OrderItem i : items) {
			sum += i.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		for(OrderItem item : items) {
			System.out.println(item.getProduct().getName()
							  + ", $" + String.format("%.2f",item.getPrice())
							  + ", Quantity: " 
							  + item.getQuantity() + ", "
							  + "Subtotal : " + "$"+ String.format("%.2f",item.subTotal()));
		}
		return "Total: price: " + String.format("%.2f%n",total());
		
	}

	
	
	
	
	
}
