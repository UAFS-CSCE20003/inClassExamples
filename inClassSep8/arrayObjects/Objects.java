package arrayObjects;

public class Objects {
	private Object[] array;
	private int size;
	private int capacity;
	
	public Objects() {
		this.capacity=10;
		array = new Object[this.capacity];
		this.size=0;
	}

	public Item get(int index) {
		Item item=null;
		if(index>=0 && index<size) {
			item = (Item) this.array[index];
		}
		return item;
	}
	
	public void append(Item item) {
		if(size<capacity) {
			array[size++] = item;
		}
	}
	
	public void show() {
		int index;
		Item item;
		
		for(index=0;index<size;index++) {
			item = (Item) this.array[index];
			System.out.printf("%s\n",item.toString());
		}
	}
	
	
}
