package inClassSep3;

public class ArrayList<T> {
	private Object[] array;
	private int used;
	private final int DEFAULT=10;
	
	public ArrayList() {
		this.array = new Object[DEFAULT];
		this.used=0;
	}
	
	public ArrayList(int capacity) {
		if(capacity<0) capacity=this.DEFAULT;
		this.array = new Object[capacity];
		this.used=0;
	}
	
	public int size() {
		return this.used;
	}
	
	public void add(T element) {
		if(this.used==this.array.length) {
			resize();
		}
		this.array[used++]=element;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if(index < 0 || index >= this.used) {
			//---------See OutOfBoundsException Class---------------------------------
			throw new OutOfBoundsException("Index: " + index + ",Size: " + this.used);
		}
		return (T) this.array[index];
	}

	private void resize() {
		Object[] newArray = new Object[this.array.length + this.DEFAULT];
		int index;
		
		for(index=0;index<this.array.length;index++) {
			newArray[index] = this.array[index];
		}
		this.array = newArray;
	}

}
