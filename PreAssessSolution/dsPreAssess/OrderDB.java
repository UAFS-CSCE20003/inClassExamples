package dsPreAssess;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class OrderDB implements OrderDBInterface {
	Order[] orders;
	int orderCount;
	
	public OrderDB() {
		orders = new Order[100];
		orderCount=0;
	}
	
	@Override
	public void loadOrders(String fileName){
		String record;
		
		Scanner orderFile;
		try {
			orderFile = new Scanner(new File(fileName));
			record = orderFile.nextLine();  //Read File Header
			while(orderFile.hasNext()) {
				record = orderFile.nextLine();
				orders[orderCount++] = new Order(record);
			}
			orderFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void showOrders() {
		int index;
		
		System.out.printf("%-8s %-30s %10s\n","Order ID","Product", "Total Amt"); 
		System.out.printf("%-8s %-30s %10s\n","--------","-------", "---------"); 
		for(index=0;index<orderCount;index++) {
			System.out.printf("%-+8d %-30s %10.2f\n", orders[index].getOrderID(),orders[index].getProduct(),orders[index].getTotalAmount());
		}
	}
}
