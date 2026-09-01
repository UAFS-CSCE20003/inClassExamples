package inClassSep1;

public class Driver {

	public static void main(String[] args) {
		//GrandParent gp = new GrandParent(1,"Jim Smith","jsmith@gmail.com");
		Parent p = new Parent(2,"Joe Smith","jsmith@gmail.com","Brittany");
		Child c = new Child(3,"Jack Smith","jsmith@gmail.com","","UAFS");

		//gp.show();
		p.show();
		c.show();
	}
	

}
