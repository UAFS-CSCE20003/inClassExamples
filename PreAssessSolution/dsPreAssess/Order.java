package dsPreAssess;

import java.text.DateFormat;
import java.util.Date;

public class Order {
	private int orderID;
	private String customerName;
	private String product;
	private double totalAmount;
	private String orderDate;

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	public Order() {}
	
	public Order(String record) {
		String[] fields = record.split(",");
		this.setOrderID(Integer.parseInt(fields[0]));
		this.setCustomerName(fields[1]);
		this.setProduct(fields[2]);
		this.setTotalAmount(Double.parseDouble(fields[3]));
		this.setOrderDate(fields[4]);
	}
	

}



