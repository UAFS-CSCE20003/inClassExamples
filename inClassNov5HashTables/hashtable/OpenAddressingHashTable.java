package hashtable;

public class OpenAddressingHashTable {
    Node[] table;
    int capacity;
    int size;
    
    public OpenAddressingHashTable(int capacity) {
        table = new Node[capacity];
        this.capacity = capacity;
        this.size = 0;
    }
    
    public int hashkey(String key) {
        return key.length() % this.capacity;
    }
    
    // Resize and rehash when load factor exceeds 0.75
    private void resize() {
    	int index;
        int oldCapacity = this.capacity;
        Node[] oldTable = this.table;
        
        this.capacity = oldCapacity * 2;
        this.table = new Node[this.capacity];
        this.size = 0;
        
        for (index = 0; index < oldCapacity; index++) {
            if (oldTable[index] != null) {
                put(oldTable[index].key, oldTable[index].value); // Re-inserts using new linear probe sequences
            }
        }
    }
    
    public void put(String key, String value) {
        // Check load factor before insertion
        if ((float)(this.size + 1) / this.capacity > 0.75) {
            resize();
        }
        
        int hash = hashkey(key);
        
        while (this.table[hash] != null) {
            if (this.table[hash].key.equals(key)) {
                this.table[hash].value = value;
                return;
            }
            System.out.printf("Hash+1: %d\n",hash);
            hash = (hash + 1) % this.capacity;
        }
        
        this.table[hash] = new Node(key, value);
        this.size++;
    }
    
    public String get(String key) {
        int hash = hashkey(key);
        int originalHash = hash;
        
        while (this.table[hash] != null) {
            if (this.table[hash].key.equals(key)) {
                return this.table[hash].value;
            }
            hash = (hash + 1) % this.capacity;
            if (hash == originalHash) {
            	break;
            }
        }
        return null;
    }
    
    public void show() {
    	int index;
        System.out.printf("\nLoad Factor: %3.2f (Size: %d, Capacity: %d)\n", 
            (float)this.size / this.capacity, this.size, this.capacity);
        System.out.printf("--------------------------\n");
        for (index = 0; index < this.capacity; index++) {
            if (this.table[index] != null) {
                System.out.printf("[%d]: Key: %s Value: %s\n", index, table[index].key, table[index].value);
            } else {
                System.out.printf("[%d]: NULL\n", index);
            }
        }
    }
}
