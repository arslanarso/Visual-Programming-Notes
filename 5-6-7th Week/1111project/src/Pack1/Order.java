package Pack1;

import java.util.ArrayList;

public class Order {
	
	int orderID;
	ArrayList<Product> products = new ArrayList<Product>();
	
	public Order(int orderID) {
		this.orderID = orderID;
	}
	
	public Order() { }

	public Order(int orderID, ArrayList<Product> products) {
		this.orderID = orderID;
		this.products = products;
	}	
}