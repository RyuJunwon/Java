package myclassTest;

class Student { 
	int studentId;
	int kor, eng, math, total;
	double average;
	public Student(int studentId, int kor, int eng, int math) {
		this.studentId = studentId;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = total / 3.0;
	}
	
}

public class ClassTask2 {
	
	public static void main(String[] args) {
		Student student = new Student(1, 40, 50, 60);
		System.out.println("총점: " + student.total + "점");
		System.out.println("총점: " + student.average + "점");
	}
}
