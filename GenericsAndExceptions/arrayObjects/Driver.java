package arrayObjects;

public class Driver {

	public static void main(String[] args) {
		Objects items = new Objects();
		
		items.append(new Item());
		items.append(new Item());
		items.append(new Item());
		items.append(new Item());
		
		items.show();

	}

}
