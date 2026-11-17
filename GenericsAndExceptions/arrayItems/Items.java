package arrayItems;

public class Items {
	private Item[] array;
	private int size;
	private int capacity;
	
	public Items() {
		this.capacity=10;
		array = new Item[this.capacity];
		this.size=0;
	}

	public Item get(int index) {
		Item item=null;
		if(index>=0 && index<size) {
			item = this.array[index];
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
		
		for(index=0;index<size;index++) {
			System.out.printf("%s\n",this.array[index].toString());
		}
	}
	
	
}
