package inClassSep1;

public abstract class GrandParent {
	protected int id;
	protected String name;
	protected String email;
	
	public GrandParent() {
		System.out.printf("**** GrandParent - Empty ****\n");
	}
	
	public GrandParent(int id, String name, String email) {
		System.out.printf("**** GrandParent - NonEmpty ****\n");
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public void show() {
		System.out.printf("**** GrandParent - show****\n");
		System.out.printf("id: %d\nname: %s\nemail: %s\n", this.id,this.name,this.email);
	}
	
	public abstract void test(int value);
}
