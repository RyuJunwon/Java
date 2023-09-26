package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Student student = new Student(1, "류준원", "도자기과");
		System.out.println(student.equals(new Student(1, "류준원", "도자기과"))); 
	
		
	}
}
