package hashtable;

public class OpenAddressingDriver {

	public static void main(String[] args) {	
		OpenAddressingHashTable table = new OpenAddressingHashTable(5);
		table.put("fname", "Joe");
		table.put("email", "jsmith@mail.com");
		table.put("address", "1201 Main");
		table.put("longy", "a really long value");
		table.put("phone", "479-788-7800");
		
		System.out.printf("Value: %s\n", table.get("email"));
		System.out.printf("Value: %s\n", table.get("phone"));
		
		table.show();
	}

}
