package OOP;

class Animal {
	
	String color = "white";
	Animal(){
		System.out.println("Animal is created");
	}


	public void display() {
		System.out.println("Display method of Animal class");
	}
}

class Dog extends Animal{
	String color = "Black";
	Dog(){
		super();
		System.out.println("Dog is created");
	}
	
	public void display() {
		System.out.println("Display method of Dog Class");
	}
	
	
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
		
		display();
		super.display();
		
	}
	
}

class Test_Super {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
	}
	
	
}