package dsPreAssess;

public class Driver {

	public static void main(String[] args) {
		OrderDBInterface orderDB = new OrderDB();
		orderDB.loadOrders("orders.txt");
		orderDB.showOrders();
	}

}
