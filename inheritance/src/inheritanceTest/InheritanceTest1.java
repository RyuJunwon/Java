package inheritanceTest;

class A {
	String name;
	int data;

	public A() {
		System.out.println("부모 생성자 호출됨");
		this.name = "A";
		this.data = 10;
	}

	void printName() {
		System.out.println(name);
	}
}

class B extends A {
	public B() {

//		this()와 super()는 동시에 직접 작성할 수 없다.

		super();
		System.out.println("자식 생성자 호출됨");
	}

}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.data);
		b.printName();
	}
}
