package OOP;

class Sub_Class1 extends Super_Class{
	
	public void here() {
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub_Class1 Ola = new Sub_Class1();
		Ola.here();
	}
}