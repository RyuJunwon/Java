package myclassTest;

//	동물 클래스 선언
//	강아지와 고양이가 있다.
//	모든 동물은 이름과 나이가 있다.
//	하지만 고양이는 아직 나이만 알고 있기 때문에, 이름은 다시 가서 물어봐야 한다.
//	위 상황에 맞게 클래스를 선언하고 필드를 구성하라.

class Animal { 
	String name;
	int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Animal(int age) {
		this.age = age;
	}	
	
	
}

public class ClassTask4 {
	
	public static void main(String[] args) {
		Animal[] animals = {
				new Animal("바둑이", 2),
				new Animal(5)
		};
	}
	
}
