package hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		Student student = new Student(1, "류준원");
		System.out.println(student.equals(new Student(1, "류준원")));
		
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(student);
		studentSet.add(new Student(1, "류준원"));
		
		System.out.println(studentSet.size());
	
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 5, 5, 5, 7));
//		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
//		System.out.println(datas);

//		HashSet<String> fruitSet = new HashSet<String>();
//		fruitSet.add("사과");
//		fruitSet.add("배");
//		fruitSet.add("자두");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");

//		System.out.println(fruitSet);
	}
}
