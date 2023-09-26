package myclassTest;

class A{
	int data;
	
	void printData() {
		System.out.println(this);
		System.out.println(this.data);
	}
}

public class CalssTest {
	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		
		a.data = 10;
		b.data = 20;
		
		a.printData();
		b.printData();
		
		System.out.println(a);
		System.out.println(b);
	}
}
