package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		초기값 : 어떤 값을 넣을지 정해지지 않았을 때 넣는 값
//		정수 : 0
//		실수 : 0.0
//		문자 : ' '
//		문자열 : null
		String firstName = null, lastName = null, name = null;
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.println(name + "님 감사합니다");
		
//		firstName = scan.next();
//		lastName = scan.next();
//		name = firstName + lastName;
//		System.out.println(name + "님 환영합니다.");
	}
}
