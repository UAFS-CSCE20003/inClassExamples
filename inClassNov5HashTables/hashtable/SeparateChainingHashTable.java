package hashtable;

public class SeparateChainingHashTable {
    Node[] table;
    int capacity;
    int size;
    
    public SeparateChainingHashTable(int capacity) {
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
        this.size = 0; // Reset size; put() will increment it correctly
        
        for (index = 0; index < oldCapacity; index++) {
            Node current = oldTable[index];
            while (current != null) {
                put(current.key, current.value); // Re-inserts into new table with new hash
                current = current.next;
            }
        }
    }
    
    public void put(String key, String value) {
        // Check load factor before insertion
        if ((float)(this.size + 1) / this.capacity > 0.75) {
            resize();
        }
        
        int hash = hashkey(key);
        Node newNode = new Node(key, value);
        
        if (this.table[hash] == null) {
            this.table[hash] = newNode;
        } else {
            Node current = this.table[hash];
            while (true) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
        this.size++;
    }
    
    public String get(String key) {
        int hash = hashkey(key);
        Node current = this.table[hash];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    
    public void show() {
    	int index;
        System.out.printf("\nLoad Factor: %3.2f (Size: %d, Capacity: %d)\n", 
            (float)this.size / this.capacity, this.size, this.capacity);
        System.out.printf("--------------------------\n");
        for (index = 0; index < this.capacity; index++) {
            System.out.printf("[%d]: ", index);
            Node current = this.table[index];
            if (current == null) {
                System.out.printf("NULL\n");
            } else {
                while (current != null) {
                    System.out.printf("[Key: %s, Val: %s] -> ", current.key, current.value);
                    current = current.next;
                }
                System.out.printf("null\n");
            }
        }
    }
}