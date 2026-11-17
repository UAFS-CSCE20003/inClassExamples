package generics;

public class ArrayList<T> {
	private T[] array;
	private int size;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public ArrayList() {
		this.capacity=10;
		array = (T[]) new Object[this.capacity];
		this.size=0;
	}

	public T get(int index) {
		T item=null;
		if(index>=0 && index<size) {
			item = this.array[index];
		}
		return item;
	}
	
	public void append(T item) {
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
