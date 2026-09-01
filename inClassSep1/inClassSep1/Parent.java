package inClassSep1;

public class Parent extends GrandParent {
	private String spouse;
	
	public Parent() {
		System.out.printf("**** Parent - Empty ****\n");
	}
	
	public Parent(int id, String name, String email,String spouse) {
		super(id,name,email);
		System.out.printf("**** Parent - NonEmpty ****\n");
		this.spouse=spouse;
	}

	@Override
	public void test(int value) {
		System.out.printf("**** Parent - Test ****\n");
		
	}
}
