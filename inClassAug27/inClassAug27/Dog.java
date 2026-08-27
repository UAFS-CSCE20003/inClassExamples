package inClassAug27;

public class Dog {
	static int noDogs=0;
	String name;
	String breed;
	int age;
	
	public Dog() {
		Dog.noDogs++;
	}
	
	public Dog(String name, String breed, int age) {
		this.name=name;
		this.breed=breed;
		this.age=age;
		Dog.noDogs++;
	}
	
	public static void showNoDogs() {
		System.out.printf("The number of dogs is %d\n", Dog.noDogs);
	}
	
	public void show() {
		System.out.printf("%s\n", this.toString());
		System.out.printf("Name: %s\nBreed: %s\nAge: %d\n\n", this.name,this.breed,this.age);
	}

	public static void main(String[] args) {
		int index;
		Dog.showNoDogs();
		
		Dog dog1 = new Dog();
		dog1.name="Gibbs";
		dog1.breed="Dachshund";
		dog1.age=2;
		
		Dog dog2 = new Dog("Murphy","LabraDoodle",8);
		
		dog1.show();
		dog2.show();
		Dog.showNoDogs();
		
		Dog[] dogs = new Dog[3];
		dogs[0]=dog1;
		dogs[1]=dog2;
		
		for(index=0;index<dogs.length;index++) {
			dogs[index].show();
		}
	}
	
}
