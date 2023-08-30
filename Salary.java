package OOP;

public class Salary extends Employee {
	

	Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
		// TODO Auto-generated constructor stub
	}
	
	protected void setSalary(double salary) {
		if(salary >= 0.0) {
			this.salary = salary;
		}
	}

	protected double getSalary() {
		return this.salary;
	}

	double salary;

	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		System.out.println("Employee name: " + getname());
		double result = salary/52;
		return result;
	}
	
}
