package generics;

public class DataStorage3<T> {
	private T item;
	private T[] list;
	
	@SuppressWarnings("unchecked")
	public DataStorage3() {
		this.list = (T[]) new Object[10];
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	public void set(int index, T value) {
		this.list[index] = value;
	}
	
	public T get(int index) {
		return this.list[index];
	}

	
	public static void main(String[] args) {
		DataStorage3<String> data = new DataStorage3<String>();
		data.setItem("Computers");
		data.set(0, "Printers");
		
		String value = data.getItem();
		
		System.out.printf("%s and %s\n", value, data.get(0));
	}
}
