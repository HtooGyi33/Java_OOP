package OOP;
class Vehicle {
	protected String brand = "Ford";
	public void honk() {
		System.out.println("Tuu, Tuu!");
	}
}
class Car extends Vehicle{
	private String model = "Mustang";
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.honk();
		System.out.println(myCar.brand + " " + myCar.model);
	}
}
