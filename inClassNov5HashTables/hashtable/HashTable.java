package hashtable;

public class HashTable {
	Node[] table;
	int capacity;
	int size;
	
	public HashTable(int capacity) {
		table = new Node[capacity];
		this.capacity=capacity;
		this.size=0;
	}
	
	public int hashkey(String key) {
    	int index;
    	int total=0;
    	for(index=0;index<key.length();index++) {
    		total = total + (key.charAt(index) * 13);
    	}
        return total % this.capacity;
    }
	
	public String get(String key) {
		String str=null;
		int hash = hashkey(key);
		if(this.table[hash]!=null) {
			str=this.table[hash].value;
		}
		return str;
	}
	
	public void put(String key, String value) {
		int hash = hashkey(key);
		Node node = new Node(key,value);
		this.table[hash]=node;
		this.size++;
	}
	
	public void show() {
		int index;
		
		System.out.printf("\nLoad Factor: %3.2f\n", (float)this.size/this.capacity);
		System.out.printf("--------------------------\n");
		for(index=0;index<this.capacity;index++) {
			if(this.table[index]!=null) {
				System.out.printf("[%d]: Key: %s Value %s\n", index, table[index].key,table[index].value);
			}else {
				System.out.printf("[%d]: NULL\n", index);
			}
		}
	}
}
