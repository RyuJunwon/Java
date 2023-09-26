package test;
	
class Person {
	Speaker speaker;
	
	Person(Speaker speaker) {
		this.speaker = speaker;
	}
	
	void turnOn() {
		System.out.println(speaker.getName() + "가 켜졌습니다.");
	}
}

class Speaker {
	private String name;
	
	Speaker(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class RedSpeaker extends Speaker {
	RedSpeaker() {
		super("빨간 스피커");
	}
}

class BlueSpeaker extends Speaker {
	public BlueSpeaker() {
		super("파란 스피커");
	}
}


public class Test01 {
	public static void main(String[] args) {
		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn();
		
		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn();
	}
}
