package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public Car() {
		;
	}

	void engineStart() {
		System.out.println("열쇠로 시동 켜짐");
	}

	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
}

// SuperCar는 브랜드, 색상, 가격, 모드가 있다.
// 시동을 켰을 때 열쇠와 음성으로 켤 수 있다.
// 시동을 껐을 때 음성으로만 끌 수 있다.
class SuperCar extends Car {

	String mode;
	
	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

	@Override
	void engineStart() {
		super.engineStart();
			System.out.println("음성으로 시동 켜짐");
	}

	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
		
	}

}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar lambo = new SuperCar("람보르기니", "노랑", 50_000, "Sport");
		System.out.println(lambo.brand);
		System.out.println(lambo.color);
		System.out.println(lambo.price);
		System.out.println(lambo.mode);
		lambo.engineStart();
		lambo.engineStop();		
	}
	

}
