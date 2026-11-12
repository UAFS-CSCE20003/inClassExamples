package trees;

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree() {
		this.root=null;
	}
	
	public void insert(int key) {
		this.root = insert(this.root,key);
	}
	
	private Node insert(Node current, int key) {
		Node newNode;
		
		//** Base Case
		if(current==null) {
			newNode = new Node(key);
			return newNode;
		}
		
		if(key < current.key) {
			current.left = insert(current.left,key);
		}
		if(key > current.key) {
			current.right = insert(current.right,key);
		}
		
		return current;
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(this.root);
		System.out.printf("\n");
	}
	
	private void inOrderTraversal(Node node) {
		if(node!=null) {
			inOrderTraversal(node.left);
			System.out.printf(" %d ", node.key);
			inOrderTraversal(node.right);
		}
	}
}
