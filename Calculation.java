package OOP;

class MyCalc extends Calculation{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc demo = new MyCalc();
		demo.addition(20, 39);
		demo.Multiplication(20, 39);
		demo.Divison(20, 5);
		demo.Subtraction(50, 39);
	}

}

class Calculation {
	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers: "+z);
	}
	
	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The subtraction of the given numbers: "+z);
	}
	
	public void Multiplication(int x, int y) {
		z = x * y;
		System.out.println("The multiplication of the given numbers: "+z);
	}
	
	public void Divison(int x, int y) {
		z = x / y;
		System.out.println("The division of the given numbers: "+z);
	}
	
}
	

