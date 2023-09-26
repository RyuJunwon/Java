package objectTest;

public class Student {
	int number;
	String name;
	String major;
	
	public Student() {;}
	
	
	
	public Student(int number, String name, String major) {
		super();
		this.number = number;
		this.name = name;
		this.major = major;
	}



	@Override  // alt + shift + s > s > enter (단축키)
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", major=" + major + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) { 
			return true;
		}
		if(obj instanceof Student) {
			Student anotherStudent = (Student) obj;
			if(number == anotherStudent.number) {
				return true;
			}
		}return false;
	}
	
}
