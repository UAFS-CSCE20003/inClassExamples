package hashtable;

public class Driver {

	public static void main(String[] args) {
		HashTable table = new HashTable(20);
		table.put("firstname", "Joe");
		table.put("email", "jsmith@mail.com");
		table.put("address", "1201 Main");
		table.put("a really long key", "a really long value");
		table.put("phone", "479-788-7800");
		
		System.out.printf("Value: %s\n", table.get("firstname"));
		System.out.printf("Value: %s\n", table.get("address"));
		
		table.show();
	}

}
