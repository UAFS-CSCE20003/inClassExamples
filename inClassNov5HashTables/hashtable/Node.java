package hashtable;

public class Node {
    String key;
    String value;
    Node next; // Used for Separate Chaining
    
    public Node() {}
    
    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
