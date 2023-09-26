package castingTest;

class Car {
	void engineStart() {
		System.out.println("열쇠로 시동 켬");
	}
}

class SuperCar extends Car {
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 켬");
	}
	
	void openRoof() {
		System.out.println("지붕 열기");
	}
}

public class CastingTest {
	public static void main(String[] args) {

		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar(); 
		
//		down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;

//		오류
//		SuperCar brokenFerrari = (SuperCar)new Car();
	
//		up casting된 객체는 재정의 된 메소드로 사용된다.
//		noOptionFerrari.engineStart();
		
//		down casting을 통애 기존 자식 필드를 사용할 수 있다.
//		fullOptionFerrari.openRoof();
		
		System.out.println(matiz instanceof Car); 					//true
		System.out.println(matiz instanceof SuperCar);				//false
		System.out.println(ferrari instanceof Car);					//true
		System.out.println(ferrari instanceof SuperCar);			//true
		System.out.println(noOptionFerrari instanceof Car);			//true
		System.out.println(noOptionFerrari instanceof SuperCar);	//true
		System.out.println(fullOptionFerrari instanceof Car);		//true
		System.out.println(fullOptionFerrari instanceof SuperCar);	//true			
	}
}
