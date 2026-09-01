package inClassSep1;

public class Child extends Parent {
	private String school;
	
	public Child() {
		System.out.printf("**** Child - Empty ****\n");
	}
	
	public Child(int id, String name, String email, String spouse,String school) {
		super(id,name,email,spouse);
		System.out.printf("**** Child - NonEmpty ****\n");
		this.school=school;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.printf("**** Child-show****\n");
		System.out.printf("id: %d\nname: %s\nemail: %s\n", this.id,this.name,this.email);
		System.out.printf("School: %s\n", this.school);
	}
}
