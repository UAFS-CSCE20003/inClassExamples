package generics;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		
		items.append(new Item());
		items.append(new Item());
		items.append(new Item());
		items.append(new Item());
		
		items.show();

	}

}
