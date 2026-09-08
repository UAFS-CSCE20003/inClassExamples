package generics;

public class DataStorage2 {
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

	
	public static void main(String[] args) {
		DataStorage2 data = new DataStorage2();
		data.setItem("Computers");
		
		String value = (String) data.getItem();
		
		System.out.printf("%s\n", value);
	}
}
