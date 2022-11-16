package Pack1;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Company {

	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public String getString(String message) {
		return JOptionPane.showInputDialog(message);
	}
	
	public int getInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	public void createCustomer() {
		Customer cus = new Customer();
		cus.customerID = getInt("ID");
		cus.name = getString("name");
		cus.surname = getString("surname");
		cus.email = getString("email");
		customers.add(cus);
		JOptionPane.showMessageDialog(null, "Customer Saved");
	}
	
	public void showCustomers() {
		for (Customer c : customers) {
			System.out.println(c.customerID+" "+
						       c.name+" "+
							   c.surname+" ");
			System.out.println("Order ID: "+c.order.orderID+" ");
			for (Product p : c.order.products) {
				System.out.println(p.productID+" "+p.title+" "+p.price+"\n");
			}
		}
	}
	
	public void showCustomer(int customerID) {
		for (Customer c : customers) {
			if (c.customerID == customerID) {
				System.out.println(c.customerID+" "+
					        	   c.name+" "+
					        	   c.surname+" ");
		System.out.println("Order ID: "+c.order.orderID+" ");
		for (Product p : c.order.products) {
			System.out.println(p.productID+" "+p.title+" "+p.price+"\n");
				}
			}
			break;
		}
	}
	
	public void newOrder(int customerID, Order order) {
		for (Customer c : customers) {
			if(c.customerID == customerID) {
				c.order = new Order();
				c.order = order;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Company com = new Company();
		
		com.createCustomer();
		com.createCustomer();
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(11, 200, "CPU"));
		products.add(new Product(22, 200, "GPU"));
		
		Order order = new Order(101, products);

		
		com.newOrder(1, order);
				
		com.newOrder(2, new Order(202, new ArrayList<Product>(Arrays.asList(new Product(1, 20, "Java Book"),
																		  new Product(2, 45, "Network Book")))));
		
		com.showCustomers();
		System.out.println();
		com.showCustomer(2);
		
		
	}

}
