package myclassTest;

class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine;

	public SuperCar(String brand, String color, int price) {
		this(brand); // 겹치는 초기화 필드가 있을 경우 this()로 해결한다.
		this.color = color;
		this.price = price;
	}

	public SuperCar(String brand) {
		this.brand = brand;
	}
	
	
//	시동 켜기
	void engineStart() {
		engine = true;
	}
	
//	시동 끄기	
	void engineStop() {
		engine = false;
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("페라리", "red", 50_000);
		SuperCar lamborghini = new SuperCar("람보르기니", null, 0);
		
		if(!ferrari.engine) {
			ferrari.engineStart();
			System.out.println(ferrari.brand + " 시동 켜짐");
		}
		else {
			System.out.println("이미 시동이 켜져있습니다.");
		}
		
		if(!ferrari.engine) {
			ferrari.engineStart();
			System.out.println(ferrari.brand + "시동 켜짐");
		}
		else {
			System.out.println("이미 시동이 켜져있습니다.");
		}
		
	}
}
