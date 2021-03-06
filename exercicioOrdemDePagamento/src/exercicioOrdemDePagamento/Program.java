package exercicioOrdemDePagamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		
		Client client = new Client(clientName, email, sdf.parse(birthDate));
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();
		
		Order order = new Order( date, OrderStatus.valueOf(orderStatus), client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();

		Product product = null;
		OrderItem orderItems = null;
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter #"+i+" item data: ");
			System.out.println("Product name: ");
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			product = new Product(productName, productPrice);
			orderItems = new OrderItem(quantity, productPrice , product);
			order.addItens(orderItems);

		}

		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order Moment: " + sdf2.format(order.getMoment()) );
		System.out.println("Status: " + order.getStatus().toString());
		System.out.println(client);
		System.out.println("Order items: ");
		
		
		System.out.println(order);

		sc.close();
	}

}
