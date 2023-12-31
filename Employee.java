package OOP;

public abstract class Employee {

	private String name;
	private String address;
	private int number;
	public abstract double computePay();
	
	Employee(String name, String address, int number){
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected String getname() {
		return name;
	}
	
	protected void setAddress(String address) {
		this.address = address;
	}
	
	public int getNumber() {
		return number;
	}
	
	
	
}
