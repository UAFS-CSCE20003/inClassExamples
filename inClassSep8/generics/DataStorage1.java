package generics;

public class DataStorage1 {
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	
	public static void main(String[] args) {
		DataStorage1 data = new DataStorage1();
		data.setItem("Computers");
		
		String value = data.getItem();
		
		System.out.printf("%s\n", value);
	}
}
